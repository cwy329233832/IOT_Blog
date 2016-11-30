package com.cwy.service;

import com.cwy.entity.Blogger;

/**
 * 博主Service接口
 * @author 陈文源
 *
 */
public interface BloggerService {

	/**
	 * 查找博主信息
	 * @return
	 */
	public Blogger find();
	
	/**
	 *通过用户名查询用户
	 * @param userName
	 * @return
	 */
	public Blogger getByUserName(String userName);
	
	/**
	 *更新博主信息
	 * @param blogger
	 * @return
	 */
	public Integer update(Blogger blogger);
}
