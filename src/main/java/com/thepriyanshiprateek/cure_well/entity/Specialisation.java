package com.thepriyanshiprateek.cure_well.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="specialisation")
public class Specialisation {
    @Id

    private String specializationCode;

    private String specializationName;
}