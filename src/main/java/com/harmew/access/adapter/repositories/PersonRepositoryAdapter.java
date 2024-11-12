package com.harmew.access.adapter.repositories;

import com.harmew.access.adapter.entities.PersonEntity;
import com.harmew.access.core.domain.Person;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonRepositoryAdapter {

    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;

    public PersonEntity createPerson(Person person) {
        PersonEntity personEntity = modelMapper.map(person, PersonEntity.class);
        return personRepository.save(personEntity);
    }
}
