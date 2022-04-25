package com.tyss.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.tyss.springannotation" })
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MobileConfiguration.class);
		ApplicationContext context1 = new AnnotationConfigApplicationContext(App.class);

		Mobile bean = context.getBean(Mobile.class);
		Mobile bean2 = context1.getBean(Mobile.class);

		System.out.println(bean);
		System.out.println(bean2);
	}
}
