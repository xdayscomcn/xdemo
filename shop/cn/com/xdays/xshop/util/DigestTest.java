package cn.com.xdays.xshop.util;

import org.apache.commons.codec.digest.DigestUtils;

public class DigestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pwd = DigestUtils.md5Hex("admin");
		System.out.println(pwd);
	}

}
