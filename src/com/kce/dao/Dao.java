package com.kce.dao;

import com.kce.model.RegisterBean;

public interface Dao {
	int validate(String name,String passw);
	
	RegisterBean reg(RegisterBean regBean);
	
	int resetPass(String pass1,String pass2);

}
