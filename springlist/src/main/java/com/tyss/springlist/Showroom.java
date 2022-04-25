package com.tyss.springlist;

import java.util.List;

import lombok.Data;

@Data
public class Showroom {
	int id;
	List<Car> carList;
}
