package cn.com.xdays.xshop.dao;

import cn.com.xdays.sys.dao.BaseDao;
import cn.com.xdays.xshop.entity.Agreement;

/**
 * Dao接口 - 会员注册协议
 * ============================================================================
 * 版权所有 2008-2010 长沙鼎诚软件有限公司，并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得SHOP++商业授权之前，您不能将本软件应用于商业用途，否则SHOP++将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.shopxx.net
 * ----------------------------------------------------------------------------
 * KEY: SHOPXXAD6A2E1229B83B3D983EBEB49F0BC7E0
 * ============================================================================
 */
public interface AgreementDao extends BaseDao<Agreement, String> {

	/**
	 * 获取Agreement对象
	 * 
	 * @return Agreement对象
	 * 
	 */
	public Agreement getAgreement();

}
