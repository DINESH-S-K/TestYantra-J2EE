package com.tyss.classwork;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class SketchPen implements Pen {
	@Override
	public void write() {
		System.out.println("Write using sketchpen");
	}

}
