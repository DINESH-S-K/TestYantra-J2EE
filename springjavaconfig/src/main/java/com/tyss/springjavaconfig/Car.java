package com.tyss.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Car {
 private String modelName;
 private String brand;
 private double price;
 //@Autowired
 private Engine engine;
}
