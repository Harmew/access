package com.harmew.access.adapter.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class VisitantDTO {
    private Long id;
    private String name;
    private String rg;
}


