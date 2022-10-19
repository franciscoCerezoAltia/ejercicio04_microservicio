package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursosDao;
import com.curso.model.Curso;

@Service
public class CursoServiceImpl implements CursoService {
	
	@Autowired
	CursosDao cursoDao;

	@Override
	public List<Curso> cursos() {
		return cursoDao.findAll();
	}

	@Override
	public Curso buscarCurso(String codCurso) {
		return cursoDao.findById(codCurso).orElse(null);
	}

	@Override
	public void altaCurso(Curso curso) {
		cursoDao.save(curso);
	}

	@Override
	public void actualizarCurso(String codCurso, int duracion) {
		Curso cursoTemp = buscarCurso(codCurso);
		cursoTemp.setDuracion(duracion);
		cursoDao.save(cursoTemp);
	}

	@Override
	public List<Curso> eliminarCurso(String codCurso) {
		Curso cursoTemp = buscarCurso(codCurso);
		cursoDao.delete(cursoTemp);
		return cursoDao.findAll();
	}

	@Override
	public List<Curso> buscarCursoPrecio(int precioMin, int precioMax) {
		return cursoDao.findCursoByPrecio(precioMin, precioMax);
	}


}
