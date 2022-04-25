package com.tyss.springtesting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	    @SuppressWarnings("resource")
		public static void main( String[] args )
	    {
	      ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");  
	      Laptop bean = context.getBean("laptop",Laptop.class);
	      System.out.println(bean);
	      Laptop bean1 = context.getBean("laptop1",Laptop.class);
	      System.out.println(bean1);
	      Laptop bean2 = context.getBean("laptop2",Laptop.class);
	      System.out.println(bean2);
	    }
	}
