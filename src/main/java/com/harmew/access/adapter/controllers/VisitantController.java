package com.harmew.access.adapter.controllers;

import com.harmew.access.adapter.converters.VisitantConverter;
import com.harmew.access.adapter.dtos.VisitantDTO;
import com.harmew.access.core.ports.VisitantServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/api/visitants")
@RequiredArgsConstructor
public class VisitantController {

    private final VisitantServicePort visitantServicePort;
    private final VisitantConverter visitantConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VisitantDTO create(@RequestBody VisitantDTO visitantDTO) {
        return visitantConverter
                .toDTO(visitantServicePort.createVisitant(visitantConverter.toDomain(visitantDTO)));
    }
}
