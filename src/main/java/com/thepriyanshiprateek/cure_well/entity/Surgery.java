package com.thepriyanshiprateek.cure_well.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="surgery")
public class Surgery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long surgeryId;

    private LocalDate surgeryDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private String surgeryCategory;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="doctor_id")
    private Doctor doctor;
}