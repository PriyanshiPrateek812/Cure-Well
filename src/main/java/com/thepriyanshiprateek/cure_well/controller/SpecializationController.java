package com.thepriyanshiprateek.cure_well.controller;

import com.thepriyanshiprateek.cure_well.entity.Specialisation;
import com.thepriyanshiprateek.cure_well.service.SpecialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/specializations")
@RestController
public class SpecializationController {

    @Autowired
    private SpecialisationService specialisationService;

    @GetMapping
    public ResponseEntity<List<Specialisation>> getAllSpecializations(){
        return new ResponseEntity<>(specialisationService.getAllSpecialisation(), HttpStatus.OK);
    }
}