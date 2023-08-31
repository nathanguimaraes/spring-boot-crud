package com.projectfinal.entitycrud.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projectfinal.entitycrud.modelo.Estudante;

public interface EstudanteRepositorio extends JpaRepository<Estudante, Long> {

}


