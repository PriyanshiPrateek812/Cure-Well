package com.thepriyanshiprateek.cure_well.service.impl;

import com.thepriyanshiprateek.cure_well.entity.Surgery;
import com.thepriyanshiprateek.cure_well.repo.SurgeryRepo;
import com.thepriyanshiprateek.cure_well.service.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SurgeryServiceImpl implements SurgeryService {

    @Autowired
    private SurgeryRepo surgeryRepository;

    @Override
    public List<Surgery> getSurgeriesForToday() {
        return surgeryRepository.findAll().stream()
                .filter(surgery -> surgery.getSurgeryDate().equals(LocalDate.now()))
                .toList();
    }

    @Override
    public Surgery editSurgery(Long id, Surgery updatedSurgery) {
        Surgery surgery=surgeryRepository
                .findById(id)
                .orElseThrow(()->new RuntimeException("Surgery not found"));
        surgery.setSurgeryDate(updatedSurgery.getSurgeryDate());
        surgery.setStartTime(updatedSurgery.getStartTime());
        surgery.setEndTime(updatedSurgery.getEndTime());
        surgery.setSurgeryCategory(updatedSurgery.getSurgeryCategory());
        return surgeryRepository.save(surgery);
    }
}