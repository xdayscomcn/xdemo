package cn.com.xdays.xshop.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.xdays.sys.entity.Member;
import cn.com.xdays.sys.service.impl.BaseServiceImpl;
import cn.com.xdays.xshop.bean.Pager;
import cn.com.xdays.xshop.dao.DepositDao;
import cn.com.xdays.xshop.entity.Deposit;
import cn.com.xdays.xshop.service.DepositService;

/**
 * Service实现类 - 预存款记录
 * ============================================================================
 * 版权所有 2008-2010 长沙鼎诚软件有限公司，并保留所有权利。
 * ----------------------------------------------------------------------------
 * 提示：在未取得SHOP++商业授权之前，您不能将本软件应用于商业用途，否则SHOP++将保留追究的权力。
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.shopxx.net
 * ----------------------------------------------------------------------------
 * KEY: SHOPXX622F01BF112F3C630E9962A378F07787
 * ============================================================================
 */

@Service
public class DepositServiceImpl extends BaseServiceImpl<Deposit, String> implements DepositService {

	@Resource
	private DepositDao depositDao;
	
	@Resource
	public void setBaseDao(DepositDao depositDao) {
		super.setBaseDao(depositDao);
	}
	
	public Pager getDepositPager(Member member, Pager pager) {
		return depositDao.getDepositPager(member, pager);
	}

}