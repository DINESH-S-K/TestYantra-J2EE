package com.tyss.springlist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
         ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       Showroom bean = context.getBean("showroom",Showroom.class);
       System.out.println(bean);
       
       Showroom bean1 = context.getBean("showroom2",Showroom.class);
       System.out.println(bean1);
       
       Company bean2 = context.getBean("company",Company.class);
       System.out.println(bean2);
       
       Company bean3 = context.getBean("company1",Company.class);
       System.out.println(bean3);
       
       Chats bean4 = context.getBean(Chats.class);
       System.out.println(bean4);
       
    }
}
