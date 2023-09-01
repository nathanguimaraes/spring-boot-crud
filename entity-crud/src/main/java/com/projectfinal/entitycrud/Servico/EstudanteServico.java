package com.projectfinal.entitycrud.Servico;

import java.util.List;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectfinal.entitycrud.modelo.Estudante;
import com.projectfinal.entitycrud.repositorio.EstudanteRepositorio;
import com.projectfinal.entitycrud.excecao.EstudanteNotFoundException;




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
	
	public Estudante buscarEstudantePorId(Long id)throws EstudanteNotFoundException {
		Optional<Estudante> opt = estudanteRepositorio.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new EstudanteNotFoundException("Estudante com id : " + id + " não existe");
		}		
	}	
	
	public void apagarEstudante(Long id) throws EstudanteNotFoundException {
		Estudante estudante = buscarEstudantePorId(id);
		estudanteRepositorio.delete(estudante);
	}

}
