package com.yfigueroa.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yfigueroa.beans.MundoBean;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new 
				ClassPathXmlApplicationContext("com/yfigueroa/xml/beans.xml");
		
		MundoBean m = appContext.getBean(MundoBean.class);
		
		System.out.println(m.getSaludo());
		
		((ConfigurableApplicationContext)appContext).close();
		

	}

}
