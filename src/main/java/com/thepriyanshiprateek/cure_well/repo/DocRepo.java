package com.thepriyanshiprateek.cure_well.repo;

import com.thepriyanshiprateek.cure_well.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocRepo extends JpaRepository<Doctor, Long> {
}