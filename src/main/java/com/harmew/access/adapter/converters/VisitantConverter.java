package com.harmew.access.adapter.converters;

import com.harmew.access.adapter.dtos.VisitantDTO;
import com.harmew.access.core.domain.Person;
import com.harmew.access.core.domain.Visitant;
import org.springframework.stereotype.Component;

@Component
public class VisitantConverter {

    public Visitant toDomain(VisitantDTO visitantDTO) {
        return new Visitant(
                visitantDTO.getId(),
                visitantDTO.getRg(),
                new Person(null, visitantDTO.getName())
        );
    }

    public VisitantDTO toDTO(Visitant visitant) {
        return new VisitantDTO(
                visitant.getId(),
                visitant.getPerson().getName(),
                visitant.getRg());
    }
}