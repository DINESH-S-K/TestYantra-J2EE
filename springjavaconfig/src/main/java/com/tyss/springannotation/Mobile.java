package com.tyss.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Mobile {
 @Value(value = "dinesh")
 String name;
 @Value(value = "Realme")
 String brand;
 @Value(value = "10000")
 double price;
 @Autowired
 Sim sim;
 
}
