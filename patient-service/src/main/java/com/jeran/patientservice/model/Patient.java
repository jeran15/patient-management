package com.jeran.patientservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    private String Name;

    public @NotNull String getName() {
        return Name;
    }

    public void setName(@NotNull String name) {
        Name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public @NotNull @jakarta.validation.constraints.Email String getEmail() {
        return Email;
    }

    public void setEmail(@NotNull @jakarta.validation.constraints.Email String email) {
        Email = email;
    }

    public @NotNull String getAddress() {
        return Address;
    }

    public void setAddress(@NotNull String address) {
        Address = address;
    }

    public @NotNull LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(@NotNull LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public @NotNull LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(@NotNull LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    @NotNull
    @Email
    @Column(unique = true)
    private String Email;

    @NotNull
    private String Address;

    @NotNull
    private LocalDate DateOfBirth;

    @NotNull
    private LocalDate registerDate;
}
