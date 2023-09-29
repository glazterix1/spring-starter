package com.example.springstarter.mappers;

import com.example.springstarter.dto.UserReadDto;
import com.example.springstarter.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserReadMapper implements Mapper<User, UserReadDto> {
    @Override
    public UserReadDto map(User from) {
        UserReadDto userReadDto = new UserReadDto();

        userReadDto.setUsername(from.getUsername());
        userReadDto.setBirthDate(from.getBirthDate());
        userReadDto.setFirstname(from.getFirstname());
        userReadDto.setLastname(from.getLastname());

        return userReadDto;
    }
}
