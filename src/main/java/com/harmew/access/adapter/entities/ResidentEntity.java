package com.harmew.access.adapter.entities;

import com.harmew.access.core.domain.Person;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.EqualsAndHashCode;

@Entity(name = "resident")
@Table(name = "tb_resident")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class ResidentEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String cpf;
    private String address;
    private String phone_number;
    @OneToOne
    @JoinColumn(name = "person_id")
    private PersonEntity personEntity;

}