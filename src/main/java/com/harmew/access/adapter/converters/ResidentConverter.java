package com.harmew.access.adapter.converters;

import com.harmew.access.adapter.dtos.ResidentDTO;
import com.harmew.access.core.domain.Person;
import com.harmew.access.core.domain.Resident;
import org.springframework.stereotype.Component;

@Component
public class ResidentConverter {

    public Resident toDomain(ResidentDTO residentDTO) {
        return new Resident(
                residentDTO.getId(),
                residentDTO.getCpf(),
                residentDTO.getAddress(),
                residentDTO.getPhone_number(),
                new Person(null, residentDTO.getName()));
    }

    public ResidentDTO toDTO(Resident resident) {
        return new ResidentDTO(
                resident.getId(),
                resident.getPerson().getName(),
                resident.getCpf(),
                resident.getAddress(),
                resident.getPhone_number());
    }
}