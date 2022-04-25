package com.tyss.springtesting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  
      Laptop bean = context.getBean("laptop",Laptop.class);
      System.out.println(bean);
      Laptop bean1 = context.getBean("laptop1",Laptop.class);
      System.out.println(bean1);
      Laptop bean2 = context.getBean("laptop2",Laptop.class);
      System.out.println(bean2);
    }
}
