package cn.xdl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import cn.xdl.dao.UserDao;

public class Test {
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao user = a.getBean(UserDao.class);
		System.out.println(user.findUserByNameAndPassword("cxh", "123"));
	}
}
