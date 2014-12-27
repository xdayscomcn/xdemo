package cn.com.xdays.xshop.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.xdays.sys.service.impl.BaseServiceImpl;
import cn.com.xdays.xshop.dao.ProductTypeDao;
import cn.com.xdays.xshop.entity.ProductType;
import cn.com.xdays.xshop.service.ProductTypeService;

/**
 * Service实现类 - 商品类型
 * ============================================================================
 * 版权所有 2008-2010 长沙鼎诚软件有限公司，并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得SHOP++商业授权之前，您不能将本软件应用于商业用途，否则SHOP++将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.shopxx.net
 * ----------------------------------------------------------------------------
 * KEY: SHOPXX11AE7AEEC7428ABAA892EED06C4E877F
 * ============================================================================
 */

@Service
public class ProductTypeServiceImpl extends BaseServiceImpl<ProductType, String> implements
		ProductTypeService {

	@Resource
	public void setBaseDao(ProductTypeDao productTypeDao) {
		super.setBaseDao(productTypeDao);
	}

}
