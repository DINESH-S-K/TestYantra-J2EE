package com.tyss.classwork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = { "com.tyss.classwork" })
public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		BookStall bean = context.getBean(BookStall.class);
		bean.getPen().write();
//		Pen bean = context.getBean(BallPen.class);
//		bean.write();
//		
//		Pen bean1 = context.getBean(InkPen.class);
//		bean1.write();
//		
//		Pen bean2 = context.getBean(SketchPen.class);
//		bean2.write();

	}

}
