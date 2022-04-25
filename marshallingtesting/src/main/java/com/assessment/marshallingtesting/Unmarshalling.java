package com.assessment.marshallingtesting;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Unmarshalling {
 public static void main(String[] args) throws FileNotFoundException {
	try {
		JAXBContext newInstance = JAXBContext.newInstance(Employee.class);
		Unmarshaller createUnmarshaller = newInstance.createUnmarshaller();
		
		FileReader fileReader = new FileReader("src/main/java/emp.xml");
		Object unmarshal = createUnmarshaller.unmarshal(fileReader);
		System.out.println(unmarshal);
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
