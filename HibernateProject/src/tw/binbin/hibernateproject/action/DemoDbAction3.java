package tw.binbin.hibernateproject.action;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


import tw.binbin.hibernateproject.model.HouseBean;
import tw.binbin.hibernateproject.model.HouseBeanDAO;
import tw.binbin.hibernateproject.model.HouseBeanService;
import tw.binbin.hibernateproject.util.HibernateUtil;

public class DemoDbAction3 {

public static void main(String[] args) {
	SessionFactory factory = HibernateUtil.getSessionFactory();

	Session session = factory.getCurrentSession();
	try {
		session.beginTransaction();
		//調用Service service調用DAO DAO內寫好方法
		HouseBeanService hService = new HouseBeanService(session);
		HouseBean hBean = hService.select(1004);
		
		System.out.println(hBean.getHouseid()+":"+hBean.getHousename());
		

		session.getTransaction().commit();
	} catch (Exception e) {
		session.getTransaction().rollback();
		e.printStackTrace();
	}
	

	HibernateUtil.closeSessionFactory();
}


	
}
