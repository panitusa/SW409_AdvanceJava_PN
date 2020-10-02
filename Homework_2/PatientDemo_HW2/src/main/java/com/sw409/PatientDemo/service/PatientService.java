package com.sw409.PatientDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.PatientDemo.models.Patient;
import com.sw409.PatientDemo.repositories.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	PatientRepository patientRepository;
	
	//create 
	
	public Patient createPatient(Patient patient)
	{
		//patientlist.add(patient);
		patientRepository.save(patient);
		return patient;
	}
	
	//read
	public List<Patient> findAllPatient()
	{
		return (List<Patient>)patientRepository.findAll();
	}
	
	//update
	public void updatePatient (Integer id, Patient p)
	{
		patientRepository.save(p);
	}
	
	//delete
	public void deletePatient(Integer id, Patient p) {
		
		patientRepository.deleteById(id);	
		
	}
	
	//Get 
	public boolean getIllnessPatient(Integer id) {
		return patientRepository.existsById(id);
	}

	
}
