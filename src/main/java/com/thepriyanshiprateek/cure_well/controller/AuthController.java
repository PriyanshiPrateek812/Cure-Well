package com.thepriyanshiprateek.cure_well.controller;

import com.thepriyanshiprateek.cure_well.entity.DoctorSpecialisation;
import com.thepriyanshiprateek.cure_well.payload.LoginDto;
import com.thepriyanshiprateek.cure_well.payload.RegisterDto;
import com.thepriyanshiprateek.cure_well.service.AuthService;
import com.thepriyanshiprateek.cure_well.service.DoctorSpecialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/auth")
@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterDto registerDto){
        String message=authService.register(registerDto);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDto loginDto){
        String message=authService.login(loginDto);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @RequestMapping("doctorBySpecialization")
    @RestController
    public static class DoctorSpecializationController {

        @Autowired
        private DoctorSpecialisationService doctorSpecialisationService;

        @GetMapping("/doctorBySpecialization/{code}")
        public ResponseEntity<List<DoctorSpecialisation>> getDoctorsBySpecialization(@PathVariable String code){
            return new ResponseEntity<>(doctorSpecialisationService.getDoctorsBySpecialization(code), HttpStatus.OK);
        }
    }
}