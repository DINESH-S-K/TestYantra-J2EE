package com.assessment.marshallingtesting;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class App {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Dinesh");
		Address address = new Address();
		address.setDoornumber(12);
		address.setStreet("ko");
		employee.setAddress(address);
		
		try {
			JAXBContext newInstance = JAXBContext.newInstance(Employee.class);
			Marshaller createMarshaller = newInstance.createMarshaller();
			//unformatted
			createMarshaller.marshal(employee, System.out);
			//formatted
			createMarshaller.setProperty(createMarshaller.JAXB_FORMATTED_OUTPUT,true);
			createMarshaller.marshal(employee, System.out);
			
			FileWriter fileWriter = new FileWriter("src/main/java/emp.xml");
			createMarshaller.marshal(employee,fileWriter);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
