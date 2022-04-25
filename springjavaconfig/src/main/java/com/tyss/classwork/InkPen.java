package com.tyss.classwork;

import org.springframework.stereotype.Component;

@Component
public class InkPen implements Pen{

	@Override
	public void write() {
		System.out.println("Write using inkpen");
	}

}
