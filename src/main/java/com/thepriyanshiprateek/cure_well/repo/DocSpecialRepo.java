package com.thepriyanshiprateek.cure_well.repo;

import com.thepriyanshiprateek.cure_well.entity.DoctorSpecialisation;
import com.thepriyanshiprateek.cure_well.entity.DoctorSpecialisationId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocSpecialRepo extends JpaRepository<DoctorSpecialisation, DoctorSpecialisationId> {
    List<DoctorSpecialisation> findBySpecialisation_SpecialisationCode(String specializationCode);
}