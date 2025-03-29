package com.thepriyanshiprateek.cure_well.service.impl;

import com.thepriyanshiprateek.cure_well.entity.Doctor;
import com.thepriyanshiprateek.cure_well.repo.DoctorRepository;
import com.thepriyanshiprateek.cure_well.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public List<Doctor> getDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor updateDoctor(Long id, Doctor doctor) {
        Doctor updatedDoctor=doctorRepository
                .findById(id)
                .orElseThrow(()->new RuntimeException("Doctor not found"));
        updatedDoctor.setDoctorName(updatedDoctor.getDoctorName());
        return doctorRepository.save(updatedDoctor);
    }

    @Override
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }
}