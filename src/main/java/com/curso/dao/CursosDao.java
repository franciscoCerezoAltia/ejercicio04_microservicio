package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Curso;

public interface CursosDao extends JpaRepository<Curso, String> {

	//Todo viene heredado
	
	@Query("SELECT t FROM Curso t WHERE t.precio > ?1 AND t.precio < ?2")
    public List<Curso> findCursoByPrecio(int precioMin, int precioMax);
}
