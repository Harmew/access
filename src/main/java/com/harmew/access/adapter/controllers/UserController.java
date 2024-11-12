package com.harmew.access.adapter.controllers;

import com.harmew.access.adapter.converters.UserConverter;
import com.harmew.access.adapter.dtos.UserDTO;
import com.harmew.access.core.ports.UserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServicePort userServicePort;
    private final UserConverter userConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO create(@RequestBody UserDTO userDTO) {
        return userConverter
                .toDTO(userServicePort.createUser(userConverter.toDomain(userDTO)));
    }

}
