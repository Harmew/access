package com.harmew.access.core.services;

import com.harmew.access.core.domain.Visitant;
import com.harmew.access.core.ports.VisitantRepositoryPort;
import com.harmew.access.core.ports.VisitantServicePort;

public class VisitantService implements VisitantServicePort {

    private final VisitantRepositoryPort visitantRepositoryPort;

    public VisitantService(VisitantRepositoryPort visitantRepositoryPort) {
        this.visitantRepositoryPort = visitantRepositoryPort;
    }

    @Override
    public Visitant createVisitant(Visitant visitant) {
        Visitant existingVisitant = visitantRepositoryPort.obtainByRg(visitant.getRg());
        if (existingVisitant != null) {
            throw new IllegalArgumentException("Visitant already exists!");
        }
        return visitantRepositoryPort.create(visitant);
    }
}