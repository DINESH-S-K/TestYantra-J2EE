package com.tyss.springjavaconfig;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Engine {
 private String name;
 private int capacity;
}
