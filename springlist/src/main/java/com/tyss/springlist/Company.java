package com.tyss.springlist;

import java.util.List;

import lombok.Data;

@Data
public class Company {
 String name;
 List<Employee> employee;
}
