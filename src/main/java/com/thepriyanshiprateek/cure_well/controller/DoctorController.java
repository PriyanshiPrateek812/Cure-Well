package com.thepriyanshiprateek.cure_well.controller;

import com.thepriyanshiprateek.cure_well.entity.Doctor;
import com.thepriyanshiprateek.cure_well.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RequestMapping("/api/doctors")
@RestController
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public ResponseEntity<List<Doctor>> getDoctors() {
        return new ResponseEntity<>(doctorService.getDoctors(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor) {
        return new ResponseEntity<>(doctorService.addDoctor(doctor), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Doctor> editDoctorDetails(@PathVariable Long id, @RequestBody Doctor doctor) {
        return new ResponseEntity<>(doctorService.updateDoctor(id, doctor),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}