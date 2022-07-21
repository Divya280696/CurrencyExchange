package com.CurrencyExchange.demo;

public class Employee {
	
	
	private String name ;
	
	private String age ;
		
		
		public String getName() {
		return name;
	}


	public Employee(String name, String age, String depart) {
			super();
			this.name = name;
			this.age = age;
			this.depart = depart;
		}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getDepart() {
		return depart;
	}


	public void setDepart(String depart) {
		this.depart = depart;
	}


		private String depart;
		
		
		

}
