package com.thepriyanshiprateek.cure_well.service;

import com.thepriyanshiprateek.cure_well.entity.Surgery;

import java.util.List;

public interface SurgeryService {
    List<Surgery> getSurgeriesForToday();
    Surgery editSurgery(Long id, Surgery updatedSurgery);
}