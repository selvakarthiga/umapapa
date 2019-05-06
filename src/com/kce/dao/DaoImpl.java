package com.kce.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kce.model.RegisterBean;
import com.kce.model.RegisterBean;

@Repository("dao")
public class DaoImpl implements Dao {
	
	@Autowired
	 SessionFactory sessionFactory;
	
	
	@Override
	public RegisterBean reg(RegisterBean regBean)
	{
		sessionFactory.getCurrentSession().save(regBean);
		return regBean;		
		
	}
	
	@Override
	public int validate(String name, String passw) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from RegisterBean l where l.name = '" + name + "'");
		List<RegisterBean> ob = q.list();
		int flag = 0;
		for(RegisterBean t: ob) {
			if(passw.equals(t.getPass()))
				flag = 1;
			else
				flag = 0;
		}
		return flag;
	}
	
	@Override
	public int resetPass(String pass1, String pass2) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from RegisterBean l where l.pass1 = '" + pass1 + "'");
		List<RegisterBean> ob = q.list();
		int flag = 0;
		for(RegisterBean t: ob) {
			if(pass2.equals(t.getPass2()))
				flag = 1;
			else
				flag = 0;
		}
		return flag;
	}

}
