package com.harmew.access.core.ports;

import com.harmew.access.core.domain.User;

public interface UserRepositoryPort {
    User create(User user);

    User obtainByEmail(String email);
}
