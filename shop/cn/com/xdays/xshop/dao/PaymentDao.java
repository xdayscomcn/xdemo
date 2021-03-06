package cn.com.xdays.xshop.dao;

import cn.com.xdays.sys.dao.BaseDao;
import cn.com.xdays.xshop.entity.Payment;

/**
 * Dao接口 - 支付
 * ============================================================================
 * 版权所有 2008-2010 长沙鼎诚软件有限公司，并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得SHOP++商业授权之前，您不能将本软件应用于商业用途，否则SHOP++将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.shopxx.net
 * ----------------------------------------------------------------------------
 * KEY: SHOPXXACA6CABD1FC7D622AF175DC35325E151
 * ============================================================================
 */

public interface PaymentDao extends BaseDao<Payment, String> {
	
	/**
	 * 获取最后生成的支付编号
	 * 
	 * @return 支付编号
	 */
	public String getLastPaymentSn();
	
	/**
	 * 根据支付编号获取对象（若对象不存在，则返回null）
	 * 
	 * @return 支付对象
	 */
	public Payment getPaymentByPaymentSn(String paymentSn);


}