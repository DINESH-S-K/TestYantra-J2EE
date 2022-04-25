package com.tyss.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	  @SuppressWarnings("resource")
	  public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		GirlFriend girlFriend = context.getBean("gf",GirlFriend.class);
		System.out.println(girlFriend);
	}
	}

