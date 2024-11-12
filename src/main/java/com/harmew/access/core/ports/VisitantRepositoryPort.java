package com.harmew.access.core.ports;

import com.harmew.access.core.domain.Visitant;

public interface VisitantRepositoryPort {
    Visitant create(Visitant visitant);

    Visitant obtainByRg(String rg);
}
