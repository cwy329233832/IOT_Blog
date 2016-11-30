package com.cwy.util;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * 加密工具
 * @author 陈文源
 *
 */
public class CryptographyUtil {

	
	/**
	 * Md5加密
	 * @param str
	 * @param salt
	 * @return
	 */
	public static String md5(String str,String salt){
		return new Md5Hash(str,salt).toString();
	}
	
	public static void main(String[] args) {
		String password="admin";
		
		System.out.println("Md5码："+CryptographyUtil.md5(password, "chen"));
	}
}
