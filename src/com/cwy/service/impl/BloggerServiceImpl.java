package com.cwy.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cwy.dao.BloggerDao;
import com.cwy.entity.Blogger;
import com.cwy.service.BloggerService;

/**
 * 博主Service 接口实现
 * @author 陈文源
 *
 */
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService{

	@Resource
	private BloggerDao bloggerDao;

	public Blogger find() {
		return bloggerDao.find();
	}

	public Blogger getByUserName(String userName) {
		return bloggerDao.getByUserName(userName);
	}

	public Integer update(Blogger blogger) {
		return bloggerDao.update(blogger);
	}
	
	
}
