package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursoService {
	
	List<Curso> cursos();
	Curso buscarCurso (String codCurso);
	void altaCurso (Curso curso);
	void actualizarCurso (String codCurso, int duracion);
	List<Curso> eliminarCurso (String codCurso);
	List<Curso> buscarCursoPrecio (int precioMin, int precioMax);
	

}
