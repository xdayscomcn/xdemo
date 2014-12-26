package cn.com.xdays.action.http;

import org.apache.struts2.convention.annotation.ParentPackage;

/**
 * 后台Action类 - 管理员类
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

@ParentPackage("http")
public class WeixinAction extends BaseHttpAction {

	private static final long serialVersionUID = 1341979251224008699L;
	 
	//接受
	public String receive() {
		System.out.println("receive");
		String jsonStr = "{name:zhangxuewen,age:15}";
		return ajaxJson(jsonStr);
	}
	
	//发送
	public String send(){
		String jsonStr = "";
		return ajaxJson(jsonStr);
	}
	
	
}