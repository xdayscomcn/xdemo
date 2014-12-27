package cn.com.xdays.xshop.dao;

import cn.com.xdays.sys.dao.BaseDao;
import cn.com.xdays.xshop.entity.Refund;

/**
 * Dao接口 - 退款
 * ============================================================================
 * 版权所有 2008-2010 长沙鼎诚软件有限公司，并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得SHOP++商业授权之前，您不能将本软件应用于商业用途，否则SHOP++将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.shopxx.net
 * ----------------------------------------------------------------------------
 * KEY: SHOPXXA2811FC2485900DF874F20212E3C615B
 * ============================================================================
 */

public interface RefundDao extends BaseDao<Refund, String> {
	
	/**
	 * 获取最后生成的退款编号
	 * 
	 * @return 收款编号
	 */
	public String getLastRefundSn();
	
	/**
	 * 根据退款编号获取对象（若对象不存在，则返回null）
	 * 
	 * @return 退款对象
	 */
	public Refund getRefundByRefundSn(String refundSn);


}