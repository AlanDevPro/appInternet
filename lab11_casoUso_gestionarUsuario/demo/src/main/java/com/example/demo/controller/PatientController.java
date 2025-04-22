package com.example.demo.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.PatientService;

import ch.qos.logback.core.model.Model;

import com.example.demo.model.Patient;

;

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

    @GetMapping("/lista")
    public String registrar(Model modelo) {
        modelo.addSubModel("listUsers", patientService.getPatients());
        return "index";
    }

}
