package com.tyss.serilizationtesting;

import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	public static void main(String[] args) throws IOException {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Dinesh");
		Address address = new Address();
		address.setDoornumber(12);
		address.setStreet("ko");
		employee.setAddress(address);
		
		ObjectMapper objectMapper = new ObjectMapper();
		String writeValueAsString = objectMapper.writeValueAsString(employee);
		System.out.println(writeValueAsString);
		
		String writeValueAsString2 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(writeValueAsString2);
		
		objectMapper.writerWithDefaultPrettyPrinter().writeValue(new FileWriter("emp.json"),employee);
	}
}
