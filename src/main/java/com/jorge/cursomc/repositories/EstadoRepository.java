package com.jorge.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jorge.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, String> {

	
	
}
