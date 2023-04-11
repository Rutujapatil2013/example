package com.employee.model;

public class Employee {
	
	String name;
	String mail;
	int number;
	String state;
	String jobrole;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getJobrole() {
		return jobrole;
	}
	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}
	public Employee(String name, String mail, int number, String state, String jobrole) {
		super();
		this.name = name;
		this.mail = mail;
		this.number = number;
		this.state = state;
		this.jobrole = jobrole;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", mail=" + mail + ", number=" + number + ", state=" + state + ", jobrole="
				+ jobrole + "]";
	}
	
	
}
