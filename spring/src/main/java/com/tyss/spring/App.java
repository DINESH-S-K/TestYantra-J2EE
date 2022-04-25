package com.tyss.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
  @SuppressWarnings("resource")
  public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	GirlFriend girlFriend = context.getBean("gf",GirlFriend.class);
	System.out.println(girlFriend);
	
//	GirlFriend girlFriend1 = context.getBean("gf1",GirlFriend.class);
//	System.out.println(girlFriend1);
	
	GirlFriend girlFriend2 = context.getBean("gf2",GirlFriend.class);
	System.out.println(girlFriend2);
}
}
