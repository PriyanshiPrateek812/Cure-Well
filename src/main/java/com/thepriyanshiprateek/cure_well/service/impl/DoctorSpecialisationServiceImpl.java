package com.thepriyanshiprateek.cure_well.service.impl;


import com.thepriyanshiprateek.cure_well.entity.DoctorSpecialisation;
import com.thepriyanshiprateek.cure_well.repo.DocSpecialRepo;
import com.thepriyanshiprateek.cure_well.service.DoctorSpecialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorSpecialisationServiceImpl implements DoctorSpecialisationService {

    @Autowired
    public DocSpecialRepo doctorSpecializationRepository;

    @Override
    public List<DoctorSpecialisation> getDoctorsBySpecialization(String specialisationCode) {
        return doctorSpecializationRepository.findBySpecialisation_SpecialisationCode(specialisationCode);
    }
}