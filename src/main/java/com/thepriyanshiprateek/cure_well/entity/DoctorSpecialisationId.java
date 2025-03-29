package com.thepriyanshiprateek.cure_well.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorSpecialisationId implements Serializable {
    private Long doctor;
    private String specialization;

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        DoctorSpecialisationId that=(DoctorSpecialisationId) o;
        return Objects.equals(doctor, that.doctor) && Objects.equals(specialization, that.specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctor, specialization);
    }
}