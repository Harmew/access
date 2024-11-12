package com.harmew.access.core.ports;

import com.harmew.access.core.domain.Resident;

public interface ResidentRepositoryPort {
    Resident create(Resident resident);

    Resident obtainByCpf(String cpf);
}
