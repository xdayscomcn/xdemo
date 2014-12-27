package cn.com.xdays.sys.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import cn.com.xdays.xshop.entity.BaseEntity;

/**
 * 实体类 - 资源类
 * ============================================================================
 * 版权所有 2015-2020 XDays科技工作室，并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得XDays商业授权之前，您不能将本软件应用于商业用途，否则XDays将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.xdays.com.cn
 * ----------------------------------------------------------------------------
 * KEY: XDAYS2D71BE456F7F0EC9ACE75DCA35586C62
 * ============================================================================
 */

@Entity
public class Resource extends BaseEntity {

	private static final long serialVersionUID = 8931644891304446093L;

	public static final String SEPARATOR = ",";
	
	private String name;// 资源名称
	private String value;// 资源标识
	private Boolean isSystem;// 是否为系统内置资源
	private String description;// 描述
	private Integer orderList;// 排序
	
	private Set<Role> roleSet;// 权限

	@Column(nullable = false, unique = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(nullable = false, unique = true)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	@Column(nullable = false, updatable = false)
	public Boolean getIsSystem() {
		return isSystem;
	}

	public void setIsSystem(Boolean isSystem) {
		this.isSystem = isSystem;
	}

	@Column(length = 5000)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(nullable = false)
	public Integer getOrderList() {
		return orderList;
	}

	public void setOrderList(Integer orderList) {
		this.orderList = orderList;
	}
	
	@ManyToMany(mappedBy = "resourceSet", fetch = FetchType.EAGER)
	public Set<Role> getRoleSet() {
		return roleSet;
	}

	public void setRoleSet(Set<Role> roleSet) {
		this.roleSet = roleSet;
	}

	// 获取权限字符串（以分隔符间隔）
	@Transient
	public String getRoleSetString() {
		StringBuffer stringBuffer = new StringBuffer();
		if(this.roleSet == null || this.roleSet.size() == 0) {
			return "";
		}
		for (Role role : this.roleSet) {
			stringBuffer.append(SEPARATOR + role.getValue());
		}
		if (stringBuffer.length() > 0) {
			stringBuffer.deleteCharAt(0);
		}
		return stringBuffer.toString();
	}

}