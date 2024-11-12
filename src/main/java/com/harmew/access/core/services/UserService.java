package com.harmew.access.core.services;

import com.harmew.access.core.domain.User;
import com.harmew.access.core.ports.UserRepositoryPort;
import com.harmew.access.core.ports.UserServicePort;

public class UserService implements UserServicePort {

    private final UserRepositoryPort userRepositoryPort;

    public UserService(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User createUser(User user) {
        User existingUser = userRepositoryPort.obtainByEmail(user.getEmail());
        if (existingUser != null) {
            throw new IllegalArgumentException("User already exists!");
        }

        return userRepositoryPort.create(user);
    }
}