package com.thepriyanshiprateek.cure_well.controller;

import com.thepriyanshiprateek.cure_well.entity.Surgery;
import com.thepriyanshiprateek.cure_well.service.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/surgeries")
@RestController
public class SurgeryController {

    @Autowired
    private SurgeryService surgeryService;

    @GetMapping("/today")
    public ResponseEntity<List<Surgery>> getSurgeriesForToday() {
        return new ResponseEntity<>(surgeryService.getSurgeriesForToday(), HttpStatus.OK);
    }
}