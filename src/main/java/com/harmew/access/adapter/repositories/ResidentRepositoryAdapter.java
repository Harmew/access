package com.harmew.access.adapter.repositories;

import com.harmew.access.adapter.entities.ResidentEntity;
import com.harmew.access.core.domain.Resident;
import com.harmew.access.core.ports.ResidentRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ResidentRepositoryAdapter implements ResidentRepositoryPort {

    private final ResidentRepository residentRepository;
    private final PersonRepositoryAdapter personRepositoryAdapter;
    private final ModelMapper modelMapper;

    @Override
    public Resident create(Resident resident) {
        ResidentEntity residentEntity = modelMapper.map(resident, ResidentEntity.class);
        residentEntity.setPersonEntity(personRepositoryAdapter.createPerson(resident.getPerson()));
        ResidentEntity newResidentEntity = residentRepository.save(residentEntity);
        return modelMapper.map(newResidentEntity, Resident.class);
    }

    @Override
    public Resident obtainByCpf(String cpf) {
        ResidentEntity residentEntity = residentRepository.findByCpf(cpf);
        if (residentEntity == null) {
            return null;
        }

        return modelMapper.map(residentEntity, Resident.class);
    }

}