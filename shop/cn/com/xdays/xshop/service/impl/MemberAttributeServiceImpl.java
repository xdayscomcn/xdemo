package cn.com.xdays.xshop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;
import org.springmodules.cache.annotations.CacheFlush;
import org.springmodules.cache.annotations.Cacheable;

import cn.com.xdays.sys.service.impl.BaseServiceImpl;
import cn.com.xdays.xshop.dao.MemberAttributeDao;
import cn.com.xdays.xshop.entity.MemberAttribute;
import cn.com.xdays.xshop.service.MemberAttributeService;

/**
 * Service实现类 - 会员属性
 * ============================================================================
 * 版权所有 2008-2010 长沙鼎诚软件有限公司，并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得SHOP++商业授权之前，您不能将本软件应用于商业用途，否则SHOP++将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.shopxx.net
 * ----------------------------------------------------------------------------
 * KEY: SHOPXX193AD837EEF756A1244E2A1816A337B9
 * ============================================================================
 */

@Service
public class MemberAttributeServiceImpl extends BaseServiceImpl<MemberAttribute, String> implements MemberAttributeService {

	@Resource
	private MemberAttributeDao memberAttributeDao;
	
	@Resource
	public void setBaseDao(MemberAttributeDao memberAttributeDao) {
		super.setBaseDao(memberAttributeDao);
	}
	
	@Cacheable(modelId = "caching")
	public List<MemberAttribute> getEnabledMemberAttributeList() {
		List<MemberAttribute> enabledMemberAttributeList = memberAttributeDao.getEnabledMemberAttributeList();
		if (enabledMemberAttributeList != null) {
			for (MemberAttribute enabledMemberAttribute : enabledMemberAttributeList) {
				Hibernate.initialize(enabledMemberAttribute);
			}
		}
		return enabledMemberAttributeList;
	}

	@Override
	@CacheFlush(modelId = "flushing")
	public void delete(MemberAttribute memberAttribute) {
		super.delete(memberAttribute);
	}

	@Override
	@CacheFlush(modelId = "flushing")
	public void delete(String id) {
		super.delete(id);
	}

	@Override
	@CacheFlush(modelId = "flushing")
	public void delete(String[] ids) {
		super.delete(ids);
	}

	@Override
	@CacheFlush(modelId = "flushing")
	public String save(MemberAttribute memberAttribute) {
		return super.save(memberAttribute);
	}

	@Override
	@CacheFlush(modelId = "flushing")
	public void update(MemberAttribute memberAttribute) {
		super.update(memberAttribute);
	}

}