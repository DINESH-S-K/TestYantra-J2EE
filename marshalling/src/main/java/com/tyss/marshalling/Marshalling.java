package com.tyss.marshalling;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshalling {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Dinesh");
		employee.setSalary(15000);
		employee.setDesignation("Intern");
		employee.setPassword("123");
		//password is transient so it cannot show in xml
		
		Address address = new Address();
		address.setArea("Salem");
		address.setHouseNo("34");
		address.setStreetName("kkk");
		address.setPincode(637504);
		employee.setAdd(address);
		
		try {
			JAXBContext newInstance = JAXBContext.newInstance(Employee.class);
			Marshaller createMarshaller = newInstance.createMarshaller();
			FileWriter fileWriter = new FileWriter("src/main/java/emp.xml");
			//unformatted
			createMarshaller.marshal(employee, System.out);
			//formatted
			createMarshaller.setProperty(createMarshaller.JAXB_FORMATTED_OUTPUT,true);
			createMarshaller.marshal(employee, System.out);
			createMarshaller.marshal(employee,fileWriter);
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(employee.getPassword());
	}
}
