package com.innova.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innova.citas.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{
	
}