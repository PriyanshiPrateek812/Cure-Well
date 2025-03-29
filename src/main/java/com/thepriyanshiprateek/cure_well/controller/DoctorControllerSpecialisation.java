package com.thepriyanshiprateek.cure_well.controller;

import com.thepriyanshiprateek.cure_well.entity.DoctorSpecialisation;
import com.thepriyanshiprateek.cure_well.service.DoctorSpecialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("doctorBySpecialization")
@RestController
public class DoctorSpecializationController {

    @Autowired
    private DoctorSpecialisationService doctorSpecializationService;

    @GetMapping("/doctorBySpecialization/{code}")
    public ResponseEntity<List<DoctorSpecialisation>> getDoctorsBySpecialization(@PathVariable String code){
        return new ResponseEntity<>(doctorSpecializationService.getDoctorsBySpecialization(code), HttpStatus.OK);
    }
}