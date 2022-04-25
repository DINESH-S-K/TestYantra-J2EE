package com.tyss.serilization;

import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

//converting objects into json
public class App {
	public static void main(String[] args) throws IOException {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Dinesh");
		employee.setSalary(100);
		employee.setDesignation("Actor");
		Address address = new Address();
		address.setArea("Salem");
		address.setHouseNo("34");
		address.setStreetName("kkk");
		address.setPincode(637504);
		employee.setAdd(address);
		ObjectMapper objectMapper = new ObjectMapper();
		// unformatted
		String writeValueAsString2 = objectMapper.writeValueAsString(employee);
		System.out.println(writeValueAsString2);
		// fomatted
		String writeValueAsString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(writeValueAsString);

		objectMapper.writerWithDefaultPrettyPrinter().writeValue(new FileWriter("emp.json"), employee);
	}
}
