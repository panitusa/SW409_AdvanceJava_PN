package com.sw409.PatientDemo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sw409.PatientDemo.models.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer> {

}
