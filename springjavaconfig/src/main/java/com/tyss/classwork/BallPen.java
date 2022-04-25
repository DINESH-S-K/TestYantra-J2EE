package com.tyss.classwork;

import org.springframework.context.annotation.Primary; 
import org.springframework.stereotype.Component;

@Component
@Primary
public class BallPen implements Pen {

	@Override
	public void write() {
	   System.out.println("Write using ballpen");
	}

}
