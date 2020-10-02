package com.sw409.PatientDemo.models;

public class Patient {

	String name;
	Integer id;
	String gender;
	String illness;

	
	public Patient(String name, Integer id, String gender, String illness) 
	{
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.illness = illness;
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
