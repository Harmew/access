package com.harmew.access.adapter.repositories;

import com.harmew.access.adapter.entities.VisitantEntity;
import com.harmew.access.core.domain.Visitant;
import com.harmew.access.core.ports.VisitantRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class VisitantRepositoryAdapter implements VisitantRepositoryPort {

    private final VisitantRepository visitantRepository;
    private final PersonRepositoryAdapter personRepositoryAdapter;
    private final ModelMapper modelMapper;

    @Override
    public Visitant create(Visitant visitant) {
        VisitantEntity visitantEntity = modelMapper.map(visitant, VisitantEntity.class);
        visitantEntity.setPersonEntity(personRepositoryAdapter.createPerson(visitant.getPerson()));
        return modelMapper.map(visitantRepository.save(visitantEntity), Visitant.class);
    }

    @Override
    public Visitant obtainByRg(String rg) {
        VisitantEntity visitant = visitantRepository.findByRg(rg);
        if (visitant == null) {
            return null;
        }
        return modelMapper.map(visitant, Visitant.class);
    }
}