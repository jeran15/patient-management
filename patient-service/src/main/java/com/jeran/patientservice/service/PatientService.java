package com.jeran.patientservice.service;

import com.jeran.patientservice.dto.PatientRequestDTO;
import com.jeran.patientservice.dto.PatientResponseDto;
import com.jeran.patientservice.exception.EmailAlreadyExsitsException;
import com.jeran.patientservice.mapper.PatientMapper;
import com.jeran.patientservice.model.Patient;
import com.jeran.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDto> getAllPatients(){
        List<Patient> patients = patientRepository.findAll();

         return patients.stream()
                .map(PatientMapper::toDto)
                .toList();
    }


    public PatientResponseDto createPatient(PatientRequestDTO patientRequestDTO) {
        if(patientRepository.existsByEmail(patientRequestDTO.getEmail())) {
            throw new EmailAlreadyExsitsException("A patient with the email " + "already exsit" + patientRequestDTO.getEmail());
        }

        Patient newPatient = patientRepository.save(
                PatientMapper.toModel(patientRequestDTO));
        return PatientMapper.toDto(newPatient);
    }

}
