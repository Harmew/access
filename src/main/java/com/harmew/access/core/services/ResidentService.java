package com.harmew.access.core.services;

import com.harmew.access.core.domain.Resident;
import com.harmew.access.core.ports.ResidentRepositoryPort;
import com.harmew.access.core.ports.ResidentServicePort;

public class ResidentService implements ResidentServicePort {

    private final ResidentRepositoryPort residentRepositoryPort;

    public ResidentService(ResidentRepositoryPort residentRepositoryPort) {
        this.residentRepositoryPort = residentRepositoryPort;
    }

    @Override
    public Resident createResident(Resident resident) {
        Resident existingResident = residentRepositoryPort.obtainByCpf(resident.getCpf());
        if (existingResident != null) {
            throw new IllegalArgumentException("Resident already exists!");
        }
        return residentRepositoryPort.create(resident);
    }
}