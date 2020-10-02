package com.sw409.PatientDemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.PatientDemo.models.Patient;
import com.sw409.PatientDemo.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	PatientService patService; 
	//= new PatientService();
	
	//create
	@PostMapping("/api/v1/patients")
	public Patient createStudent(@RequestBody Patient patient) {
		return patService.createPatient(patient);
	}
	
	//read 
	@GetMapping("/api/v1/patients")
	public List<Patient> findAllPatient()
	{
		return patService.findAllPatient();
	}
	
	@GetMapping("/api/v1/patients/{patientillness}")
	public void getillnessPatient(@PathVariable("patientillness") Integer id, @RequestBody Patient patient)
	{
		patService.getIllnessPatient(id);
	}
	
	//update
	@PutMapping("/api/v1/patients/{patientid}")
	public void updatePatient(@PathVariable("patientid") Integer id, @RequestBody Patient patient) 
	{
		patService.updatePatient(id, patient);
	}
	
	//delete
	@DeleteMapping("/api/v1/patients/{patientid}")
	public void deletePatient(@PathVariable("patientid") Integer id, @RequestBody Patient patient)
	{
		patService.deletePatient(id, patient);
	}
}
