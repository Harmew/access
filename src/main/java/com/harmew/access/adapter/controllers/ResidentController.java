package com.harmew.access.adapter.controllers;

import com.harmew.access.adapter.converters.ResidentConverter;
import com.harmew.access.adapter.dtos.ResidentDTO;
import com.harmew.access.core.ports.ResidentServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/residents")
@RequiredArgsConstructor
public class ResidentController {

    private final ResidentServicePort residentServicePort;
    private final ResidentConverter residentConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResidentDTO create(@RequestBody ResidentDTO residentDTO) {
        return residentConverter
                .toDTO(residentServicePort.createResident(residentConverter.toDomain(residentDTO)));
    }
}
