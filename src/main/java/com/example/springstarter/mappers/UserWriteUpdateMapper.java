package com.example.springstarter.mappers;

import com.example.springstarter.dto.UserWriteUpdateDto;
import com.example.springstarter.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserWriteUpdateMapper implements Mapper<UserWriteUpdateDto, User> {

    @Override
    public User map(UserWriteUpdateDto from) {
        return User.builder()
                .username(from.getUsername())
                .birthDate(from.getBirthDate())
                .firstname(from.getFirstname())
                .lastname(from.getLastname())
                .build();
    }

    @Override
    public User map(UserWriteUpdateDto from, User toObject) {
        toObject.setUsername(from.getUsername());
        toObject.setBirthDate(from.getBirthDate());
        toObject.setFirstname(from.getFirstname());
        toObject.setLastname(from.getLastname());

        return toObject;
    }
}
