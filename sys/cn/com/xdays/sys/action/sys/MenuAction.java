package cn.com.xdays.sys.action.sys;

import org.apache.struts2.convention.annotation.ParentPackage;

/**
 * 后台Action类 - 菜单
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

@ParentPackage("sys")
public class MenuAction extends BaseAdminAction {

	private static final long serialVersionUID = 6465259795235263493L;

	// 商店配置
	public String setting() {
		return "setting";
	}
	
	// 会员
	public String member() {
		return "member";
	}
	
	// 商品
	public String product() {
		return "product";
	}
	
	// 页面管理
	public String content() {
		return "content";
	}
	
	// 订单管理
	public String order() {
		return "order";
	}
	
	// 管理员
	public String admin() {
		return "admin";
	}

	// 主体
	public String main() {
		return "main";
	}

	// 常用
	public String common() {
		return "common";
	}

	// 头部
	public String header() {
		return "header";
	}

}