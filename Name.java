package com.marathon.again;

public class Name {
	
	private String name;
	private String surname;
	private String middleName;
	
	public Name(String name, String surname, String middleName) {
		super();
		this.name = name;
		this.surname = surname;
		this.middleName = middleName;
	}
	
	public Name(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.middleName = "";
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	@Override
	public String toString() {
		return "Name [name=" + name + ", surname=" + surname + ", middleName=" + middleName + "]";
	}
	
}
