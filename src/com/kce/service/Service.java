package com.kce.service;

import com.kce.model.RegisterBean;

public interface Service {
	
	RegisterBean reg(RegisterBean regBean) ;
	
	int validate(String name,String passw);
	int resetPass(String pass1,String pass2);

}
