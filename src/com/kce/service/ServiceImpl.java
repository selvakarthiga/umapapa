package com.kce.service;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kce.dao.Dao;
import com.kce.model.RegisterBean;

@Service("service")
public abstract  class ServiceImpl implements Service {
	
	@Autowired
	private Dao dao;

	
	@Transactional
	public RegisterBean reg(RegisterBean regBean)
	{
		RegisterBean a=(RegisterBean)dao.reg(regBean);
		return a;
	}
	
	@Transactional
	public int validate(String name, String passw) {
		return dao.validate(name, passw);
	}
	
	@Transactional
	public int resetPass(String pass1, String pass2) {
		return dao.validate(pass1, pass2);
	}



}

	