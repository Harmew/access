package com.harmew.access.adapter.converters;

import com.harmew.access.adapter.dtos.UserDTO;
import com.harmew.access.core.domain.Person;
import com.harmew.access.core.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public User toDomain(UserDTO userDTO) {
        return new User(
                userDTO.getId(),
                userDTO.getEmail(),
                userDTO.getPassword(),
                userDTO.getAdmin(),
                new Person(null, userDTO.getName()));
    }

    public UserDTO toDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getPerson().getName(),
                user.getEmail(),
                user.getPassword(),
                user.getAdmin());
    }
}
