package com.SafeMove.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SafeMove.models.Destinos;

@Repository
public interface setorRepository extends JpaRepository<Destinos, Long> {
    
}