package com.projectfinal.entitycrud.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EstudanteControle {	
	
	@GetMapping("/")
    public String listarEstudantes() {	
		return "/lista-estudantes";
    }	

}
