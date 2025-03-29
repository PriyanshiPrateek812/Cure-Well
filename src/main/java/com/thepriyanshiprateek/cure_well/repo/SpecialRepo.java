package com.thepriyanshiprateek.cure_well.repo;


import com.thepriyanshiprateek.cure_well.entity.Specialisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialRepo extends JpaRepository<Specialisation, String> {
}