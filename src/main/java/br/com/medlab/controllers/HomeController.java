package br.com.medlab.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import br.com.medlab.models.Exame;
import br.com.medlab.models.Paciente;
import br.com.medlab.services.ExameService;
import br.com.medlab.services.PacienteService;

@Controller
public class HomeController {
	
	@Autowired
	ExameService exameService;
	
	@Autowired
	PacienteService pacienteService;
	
	@GetMapping("/home")
	public String home(Model model) {
		List<Exame> exames = exameService.buscarTodosExames(); 
		List<Paciente> pacientes = pacienteService.buscarTodosPacientes(); 
		model.addAttribute("exames", exames);
		model.addAttribute( "pacientes", pacientes);
		return "home";
	}
	
	@PostMapping("/gravarexame")
	public String gravarExame(Exame exame){
		exameService.gravarExame(exame);
		return "redirect:/home";
	}
	
	@PutMapping("atualizarexame")
	public String atualizarExame(Exame exame) {
		exameService.atualizarExame(exame);
		return "redirect:/home";
	}

}
