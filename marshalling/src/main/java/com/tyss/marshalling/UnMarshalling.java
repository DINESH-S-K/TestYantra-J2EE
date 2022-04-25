package com.tyss.marshalling;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshalling {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			JAXBContext context = JAXBContext.newInstance(Employee.class);
			Unmarshaller createUnmarshaller = context.createUnmarshaller();
			FileReader fileReader = new FileReader("src/main/java/emp.xml");
			Object unmarshal = createUnmarshaller.unmarshal(fileReader);
			System.out.println(unmarshal);
			
			Employee e =(Employee) unmarshal;
			System.out.println(e.getId());
		}catch (JAXBException e) {
			
		}
	}
}
