package com.jeran.patientservice.mapper;

import com.jeran.patientservice.dto.PatientRequestDTO;
import com.jeran.patientservice.dto.PatientResponseDto;
import com.jeran.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {
    public static PatientResponseDto toDto(Patient patient) {
        PatientResponseDto patientDto = new PatientResponseDto();
        patientDto.setId(patient.getId().toString());
        patientDto.setName(patient.getName());
        patientDto.setAddress(patient.getAddress());
        patientDto.setEmail(patient.getEmail());
        patientDto.setAddress(patient.getAddress());
        patientDto.setDateOfBirth(patient.getDateOfBirth().toString());
        return patientDto;
    }

    public static Patient toModel(PatientRequestDTO patientRequestDTO) {
        Patient patient = new Patient();
        patient.setName(patientRequestDTO.getName());
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        patient.setRegisterDate(LocalDate.parse(patientRequestDTO.getRegisterDate()));
        return patient;
    }
}
