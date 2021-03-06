package com.tool.test;

import java.util.Date;

public class Person {

	private String name;
	private int age;
	private Date birthDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Person(String name, int age, Date birthDate) {
		super();
		this.name = name;
		this.age = age;
		this.birthDate = birthDate;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", birthDate="
				+ birthDate + "]";
	}
	
	
	
}
