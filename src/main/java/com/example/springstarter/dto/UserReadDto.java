package com.example.springstarter.dto;

import lombok.Value;

import java.time.LocalDate;

@Value
public class UserReadDto {
    String username;
    LocalDate birthDate;
    String firstname;
    String lastname;
}
