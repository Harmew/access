package com.harmew.access.adapter.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "visitant")
@Table(name = "tb_visitant")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class VisitantEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String rg;
    @OneToOne
    @JoinColumn(name = "person_id")
    private PersonEntity personEntity;

}