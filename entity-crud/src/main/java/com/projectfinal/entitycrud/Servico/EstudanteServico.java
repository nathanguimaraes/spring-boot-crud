package com.projectfinal.entitycrud.Servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectfinal.entitycrud.modelo.Estudante;
import com.projectfinal.entitycrud.repositorio.EstudanteRepositorio;


@Service
public class EstudanteServico {
	
	@Autowired
	private EstudanteRepositorio estudanteRepositorio;
	
	public Estudante criarEstudante(Estudante estudante) {
		return estudanteRepositorio.save(estudante);
	}
	
	public List<Estudante> buscarTodosEstudantes() {
		return estudanteRepositorio.findAll();
	}
	
		

}

