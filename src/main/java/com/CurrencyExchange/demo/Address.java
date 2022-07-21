package com.CurrencyExchange.demo;

public class Address {
	
	
	private String streetNo;
	
	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public Address(String streetNo, String streetName) {
		super();
		this.streetNo = streetNo;
		this.streetName = streetName;
	}

	public String getStreetName() {
		return streetName;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	private String streetName;

}
