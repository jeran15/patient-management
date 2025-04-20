package com.jeran.patientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientServiceApplication.class, args);
    }

}
//-- Insert sample data using PostgreSQL's ON CONFLICT DO NOTHING
//INSERT INTO public.patient (id, name, email, address, date_of_birth, register_date)
//VALUES
//    ('123e4567-e89b-12d3-a456-426614174000', 'John Doe', 'john.doe@example.com', '123 Main St, Springfield', '1985-06-15', '2024-01-10'),
//    ('123e4567-e89b-12d3-a456-426614174001', 'Jane Smith', 'jane.smith@example.com', '456 Elm St, Shelbyville', '1990-09-23', '2023-12-01'),
//    ('123e4567-e89b-12d3-a456-426614174002', 'Alice Johnson', 'alice.johnson@example.com', '789 Oak St, Capital City', '1978-03-12', '2022-06-20'),
//    ('123e4567-e89b-12d3-a456-426614174003', 'Bob Brown', 'bob.brown@example.com', '321 Pine St, Springfield', '1982-11-30', '2023-05-14'),
//    ('123e4567-e89b-12d3-a456-426614174004', 'Emily Davis', 'emily.davis@example.com', '654 Maple St, Shelbyville', '1995-02-05', '2024-03-01'),
//    ('223e4567-e89b-12d3-a456-426614174005', 'Michael Green', 'michael.green@example.com', '987 Cedar St, Springfield', '1988-07-25', '2024-02-15'),
//    ('223e4567-e89b-12d3-a456-426614174006', 'Sarah Taylor', 'sarah.taylor@example.com', '123 Birch St, Shelbyville', '1992-04-18', '2023-08-25'),
//    ('223e4567-e89b-12d3-a456-426614174007', 'David Wilson', 'david.wilson@example.com', '456 Ash St, Capital City', '1975-01-11', '2022-10-10'),
//    ('223e4567-e89b-12d3-a456-426614174008', 'Laura White', 'laura.white@example.com', '789 Palm St, Springfield', '1989-09-02', '2024-04-20')
//ON CONFLICT (id) DO NOTHING;
//
//-- Create an index on email for better query performance
//CREATE INDEX IF NOT EXISTS idx_patient_email ON public.patient(email);
//
//-- Query to view the data (matches what's shown in the screenshot)
//SELECT * FROM public.patient ORDER BY id ASC;