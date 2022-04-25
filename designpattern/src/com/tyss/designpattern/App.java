package com.tyss.designpattern;

public class App {
public static void main(String[] args) {
	Employee object = Employee.getObject();
	System.out.println(object);
	Employee object1 = Employee.getObject();
	System.out.println(object1);
	Employee object2 = Employee.getObject();
	System.out.println(object2);
	Employee object3 = Employee.getObject();
	System.out.println(object3);
	Employee object4 = Employee.getObject();
	System.out.println(object4);
	Employee object5 = Employee.getObject();
	System.out.println(object5);
	
	// Only one object is created. Single time Design Pattern
	
	Employee1 object6 = Employee1.getObject();
	System.out.println(object6);
	Employee1 object7 = Employee1.getObject();
	System.out.println(object7);
	
}
}
