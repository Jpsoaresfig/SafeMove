package com.SafeMove.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SafeMove.SafeMove.models.Modelo;

@Repository
public interface modeloRepository extends JpaRepository<Modelo, Long> {
	
	
   
}