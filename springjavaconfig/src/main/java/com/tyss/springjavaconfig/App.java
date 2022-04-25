package com.tyss.springjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	@SuppressWarnings("resource")
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
        Car bean = context.getBean("audi",Car.class);
        System.out.println(bean);
        
        Car bean1 = context.getBean("Lambogini",Car.class);
        System.out.println(bean1);
    }
}
