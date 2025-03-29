package com.thepriyanshiprateek.cure_well.repo;

import com.thepriyanshiprateek.cure_well.entity.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurgeryRepo extends JpaRepository<Surgery, Long> {
}