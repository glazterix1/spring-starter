package com.example.springstarter.dto;

import lombok.Value;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

@Value
public class UserWriteUpdateDto {
    @Email
    String username;

    @Past
    LocalDate birthDate;

    @NotNull
    @Size(min = 2, max = 15)
    String firstname;

    @NotNull
    String lastname;
}
