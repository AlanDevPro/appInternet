package com.innova.citas.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.innova.citas.model.Patient;
import com.innova.citas.repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public ArrayList<Patient> getPatients(){
        return ((ArrayList<Patient>) patientRepository.findAll());
    }

    public Patient save(Patient patient){
        return (patientRepository.save(patient));
    }

    public boolean delete(Long id){
        try {
            patientRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
