package com.sw409.PatientDemo.service;

import java.util.ArrayList;
import java.util.List;

import com.sw409.PatientDemo.models.Patient;

public class PatientService {
	
	List<Patient> patientlist = new ArrayList<>();
	
	//create 
	
	public Patient createPatient(Patient patient)
	{
		patientlist.add(patient);
		return patient;
	}
	
	//read
	public List<Patient> findAllPatient()
	{
		return patientlist;
	}
	
	//update
	public void updatePatient (Integer id, Patient p)
	{
		for (int i = 0; i < patientlist.size(); i++) {
			if (patientlist.get(i).getId().equals(id)) 
			{
				patientlist.set(i, p);
			}
			
		}
	}
	
	//delete
	public void deletePatient(Integer id, Patient p) {
		
		for (int i = 0; i < patientlist.size(); i++) {
			if (patientlist.get(i).getId().equals(id)) 
			{
				patientlist.remove(i);
			}
			
		}
		
	}
	
	//Get 
	public void getIllnessPatient(String illness, Patient p)
	{
		for (int i = 0; i < patientlist.size(); i++) {
			if (patientlist.get(i).getIllness().equals(illness)) {
				patientlist.get(i);
			}
			
		}
		
	}
	
}
