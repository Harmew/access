package com.harmew.access.adapter.repositories;

import com.harmew.access.adapter.entities.UserEntity;
import com.harmew.access.core.domain.User;
import com.harmew.access.core.ports.UserRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserRepository userRepository;
    private final PersonRepositoryAdapter personRepositoryAdapter;
    private final ModelMapper modelMapper;

    @Override
    public User create(User user) {
        UserEntity userEntity = modelMapper.map(user, UserEntity.class);
        userEntity.setPersonEntity(personRepositoryAdapter.createPerson(user.getPerson()));
        return modelMapper.map(userRepository.save(userEntity), User.class);
    }

    @Override
    public User obtainByEmail(String email) {
        UserEntity user = userRepository.findByEmail(email);
        if (user == null) {
            return null;
        }
        return modelMapper.map(user, User.class);
    }
}