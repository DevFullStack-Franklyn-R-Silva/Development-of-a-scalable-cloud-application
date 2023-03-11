package com.github.hadesfranklyn.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hadesfranklyn.project.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{

	Cambio findByFromAndTo(String from, String to);
}
