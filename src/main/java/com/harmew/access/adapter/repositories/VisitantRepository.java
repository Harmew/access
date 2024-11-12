package com.harmew.access.adapter.repositories;

import com.harmew.access.adapter.entities.VisitantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitantRepository extends JpaRepository<VisitantEntity, Long> {
    VisitantEntity findByRg(String rg);
}
