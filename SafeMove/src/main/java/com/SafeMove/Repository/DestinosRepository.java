package com.SafeMove.Repository;

import com.SafeMove.models.Destinos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinosRepository extends JpaRepository<Destinos, Long> {
    
}