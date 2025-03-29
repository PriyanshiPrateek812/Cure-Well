package com.thepriyanshiprateek.cure_well.service.impl;

import com.thepriyanshiprateek.cure_well.entity.Specialisation;
import com.thepriyanshiprateek.cure_well.repo.SpecialRepo;
import com.thepriyanshiprateek.cure_well.service.SpecialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialisationServiceImpl implements SpecialisationService{

    @Autowired
    private SpecialRepo specialisationRepository;

    @Override
    public List<Specialisation> getAllSpecialization() {
        return specialisationRepository.findAll();
    }
}