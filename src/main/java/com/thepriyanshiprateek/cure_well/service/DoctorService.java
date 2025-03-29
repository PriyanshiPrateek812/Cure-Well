package com.thepriyanshiprateek.cure_well.service;

import com.thepriyanshiprateek.cure_well.entity.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getDoctors();
    Doctor addDoctor(Doctor doctor);
    Doctor updateDoctor(Long id, Doctor doctor);
    void deleteDoctor(Long id);
}