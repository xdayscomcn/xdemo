package cn.com.xdays.xshop.service;

import cn.com.xdays.sys.service.BaseService;
import cn.com.xdays.xshop.entity.Shipping;

/**
 * Service接口 - 发货
 * ============================================================================
 * 版权所有 2008-2010 长沙鼎诚软件有限公司，并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得SHOP++商业授权之前，您不能将本软件应用于商业用途，否则SHOP++将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.shopxx.net
 * ----------------------------------------------------------------------------
 * KEY: SHOPXXCB3CC9F5224F4E532DC7C0C2EB2379DA
 * ============================================================================
 */

public interface ShippingService extends BaseService<Shipping, String> {

	/**
	 * 获取最后生成的发货编号
	 * 
	 * @return 发货编号
	 */
	public String getLastShippingSn();

}