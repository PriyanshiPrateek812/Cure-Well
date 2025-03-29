package com.thepriyanshiprateek.cure_well.service;

import com.thepriyanshiprateek.cure_well.entity.DoctorSpecialisation;

import java.util.List;

public interface DoctorSpecialisationService {
    List<DoctorSpecialisation> getDoctorsBySpecialization(String specializationCode);
}