package br.com.medlab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medlab.models.Paciente;
import br.com.medlab.repositories.PacienteRepository;



@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	
	public List<Paciente> buscarTodosPacientes(){
		return pacienteRepository.findAll();
	}
	
	public Paciente buscarPacientePorId(Long id) {
		return pacienteRepository.getReferenceById(id);
	}
	
	public void removerPacientePorId(Long id) {
		pacienteRepository.deleteById(id);
	}
	
}
