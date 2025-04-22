package com.jeran.patientservice.controller;

import com.jeran.patientservice.dto.PatientRequestDTO;
import com.jeran.patientservice.dto.PatientResponseDto;
import com.jeran.patientservice.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public ResponseEntity<List<PatientResponseDto>> getPatients() {
        List<PatientResponseDto> patients = patientService.getAllPatients();
        return ResponseEntity.ok().body(patients);
    }

    @PostMapping
    public ResponseEntity<PatientResponseDto> createPatient(@Valid @RequestBody PatientRequestDTO patientRequestDTO) {
        PatientResponseDto patientResponseDto = patientService.createPatient(patientRequestDTO);
        return ResponseEntity.ok().body(patientResponseDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PatientResponseDto> updatePatient(@PathVariable UUID id,
                                                            @RequestBody PatientRequestDTO patientRequestDTO) {

        PatientResponseDto patientResponseDto = patientService.updatePatient(id,patientRequestDTO);

        return ResponseEntity.ok().body(patientResponseDto);
    }
}
