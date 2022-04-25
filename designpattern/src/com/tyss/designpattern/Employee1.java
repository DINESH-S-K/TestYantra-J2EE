package com.tyss.designpattern;

public class Employee1 {
	private Employee1() {
	}

	final static Employee1 employee = new Employee1();

	static Employee1 getObject() {
		return employee;
	}

}
