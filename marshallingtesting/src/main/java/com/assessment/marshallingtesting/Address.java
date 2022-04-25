package com.assessment.marshallingtesting;

public class Address {
  private int doornumber;
  private String street;
  
public Address(int doornumber, String street) {
	this.doornumber = doornumber;
	this.street = street;
}
public Address() {
	// TODO Auto-generated constructor stub
}
public int getDoornumber() {
	return doornumber;
}
public void setDoornumber(int doornumber) {
	this.doornumber = doornumber;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
  
}
