package com.sis324.citas.controller;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sis324.citas.service.PatientService;
import com.sis324.citas.model.Patient;;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public ArrayList<Patient> showPactients() {
        return patientService.getPatients();
    }

    @PostMapping
    public Patient insert(@RequestBody Patient patient) {
        return patientService.save(patient);
    }

    @PutMapping
    public Patient edit(@RequestBody Patient patient) {
        return patientService.save(patient);
    }

    @DeleteMapping(value = "/{id}")
    public boolean delete(@PathVariable Long id) {
        return patientService.delete(id);
    }

}
