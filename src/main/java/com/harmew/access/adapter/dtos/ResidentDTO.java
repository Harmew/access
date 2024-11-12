package com.harmew.access.adapter.dtos;

import com.harmew.access.core.domain.Person;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class ResidentDTO {
    private Long id;
    private String name;
    private String cpf;
    private String address;
    private String phone_number;
}


