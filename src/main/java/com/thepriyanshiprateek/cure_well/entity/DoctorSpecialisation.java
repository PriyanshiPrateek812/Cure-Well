package com.thepriyanshiprateek.cure_well.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(DoctorSpecialisationId.class)
@Table(name="doctorSpecialization")
public class DoctorSpecialisation {

    @Id
    @ManyToOne
    @JoinColumn(name="doctor_id", nullable=false)
    private Doctor doctor;

    @Id
    @ManyToOne
    @JoinColumn(name="specialization_code", nullable=false)
    private Specialisation specialisation;

    private LocalDate specialisationDate;
}