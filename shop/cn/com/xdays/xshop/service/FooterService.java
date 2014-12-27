package cn.com.xdays.xshop.service;

import cn.com.xdays.sys.service.BaseService;
import cn.com.xdays.xshop.entity.Footer;

/**
 * Service接口 - 页面底部信息
 * ============================================================================
 * 版权所有 2008-2010 长沙鼎诚软件有限公司，并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得SHOP++商业授权之前，您不能将本软件应用于商业用途，否则SHOP++将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.shopxx.net
 * ----------------------------------------------------------------------------
 * KEY: SHOPXX9A4F32B6D12BE5FBC656E3BDDD8A9BBD
 * ============================================================================
 */

public interface FooterService extends BaseService<Footer, String> {

	/**
	 * 获取Footer
	 * 
	 * @return Footer
	 * 
	 */
	public Footer getFooter();

}