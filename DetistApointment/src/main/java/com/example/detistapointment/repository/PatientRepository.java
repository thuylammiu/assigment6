package com.example.detistapointment.repository;

import com.example.detistapointment.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // Find patient by ID
    Optional<Patient> findById(Long id);

    // Find all patients
    List<Patient> findAll();

    // Save or update a patient
    <S extends Patient> S save(S patient);

    // Delete a patient by ID
    void deleteById(Long id);
}
