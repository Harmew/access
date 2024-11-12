package com.harmew.access.adapter.repositories;

import com.harmew.access.adapter.entities.ResidentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentRepository extends JpaRepository<ResidentEntity, Long> {
    ResidentEntity findByCpf(String cpf);
}
