-- Ensure the 'patient' table exists
CREATE TABLE IF NOT EXISTS patient (
                                       id              UUID PRIMARY KEY,
                                       name            VARCHAR(255)        NOT NULL,
                                       email           VARCHAR(255) UNIQUE NOT NULL,
                                       address         VARCHAR(255)        NOT NULL,
                                       date_of_birth   DATE                NOT NULL,
                                       registered_date DATE                NOT NULL
);

-- Insert well-known UUIDs for specific patients
INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '123e4567-e89b-12d3-a456-426614174000' AS id,
       'John Doe' AS name,
       'john.doe@example.com' AS email,
       '123 Main St, Springfield' AS address,
       '1985-06-15' AS date_of_birth,
       '2024-01-10' AS registered_date
WHERE NOT EXISTS (
    SELECT 1 FROM patient WHERE id = '123e4567-e89b-12d3-a456-426614174000'
);

INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '123e4567-e89b-12d3-a456-426614174001' AS id,
       'Jane Smith' AS name,
       'jane.smith@example.com' AS email,
       '456 Elm St, Shelbyville' AS address,
       '1990-09-23' AS date_of_birth,
       '2023-12-01' AS registered_date
WHERE NOT EXISTS (
    SELECT 1 FROM patient WHERE id = '123e4567-e89b-12d3-a456-426614174001'
);

INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '123e4567-e89b-12d3-a456-426614174002' AS id,
       'Alice Johnson' AS name,
       'alice.johnson@example.com' AS email,
       '789 Oak St, Capital City' AS address,
       '1978-03-12' AS date_of_birth,
       '2022-06-20' AS registered_date
WHERE NOT EXISTS (
    SELECT 1 FROM patient WHERE id = '123e4567-e89b-12d3-a456-426614174002'
);

INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '123e4567-e89b-12d3-a456-426614174003' AS id,
       'Bob Brown' AS name,
       'bob.brown@example.com' AS email,
       '321 Pine St, Springfield' AS address,
       '1982-11-30' AS date_of_birth,
       '2023-05-14' AS registered_date
WHERE NOT EXISTS (
    SELECT 1 FROM patient WHERE id = '123e4567-e89b-12d3-a456-426614174003'
);

INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '123e4567-e89b-12d3-a456-426614174004' AS id,
       'Emily Davis' AS name,
       'emily.davis@example.com' AS email,
       '654 Maple St, Shelbyville' AS address,
       '1995-02-05' AS date_of_birth,
       '2024-03-01' AS registered_date
WHERE NOT EXISTS (
    SELECT 1 FROM patient WHERE id = '123e4567-e89b-12d3-a456-426614174004'
);

-- Additional patients
INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '223e4567-e89b-12d3-a456-426614174005' AS id,
       'Michael Green' AS name,
       'michael.green@example.com' AS email,
       '987 Cedar St, Springfield' AS address,
       '1988-07-25' AS date_of_birth,
       '2024-02-15' AS registered_date
WHERE NOT EXISTS (
    SELECT 1 FROM patient WHERE id = '223e4567-e89b-12d3-a456-426614174005'
);

-- [Repeat the pattern with aliases for all remaining INSERT statements up to '223e4567-e89b-12d3-a456-426614174014']