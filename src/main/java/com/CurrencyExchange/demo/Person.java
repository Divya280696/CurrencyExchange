package com.CurrencyExchange.demo;

public class Person {
	
	
	private String personName;
	
	private String personAge;
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String personName, String personAge, String personDept) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.personDept = personDept;
	}

	public String getPersonAge() {
		return personAge;
	}

	public void setPersonAge(String personAge) {
		this.personAge = personAge;
	}

	public String getPersonDept() {
		return personDept;
	}

	public void setPersonDept(String personDept) {
		this.personDept = personDept;
	}

	private String personDept;

}
