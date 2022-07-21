package br.com.medlab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.medlab.models.Exame;
import br.com.medlab.repositories.ExameRepository;

@Service
public class ExameService {
	
	@Autowired
	ExameRepository exameRepository;
	
	
	public void gravarExame(Exame exame) {
		exameRepository.save(exame);
	}
	
	public List<Exame> buscarTodosExames(){
		return exameRepository.findAll();
	}
	
	public Exame buscarExamePorId(Long id) {
		return exameRepository.getReferenceById(id);
	}
	
	public void removerExamePorId(Long id) {
		exameRepository.deleteById(id);
	}
	
	public void atualizarExame(Exame exame) {
		exameRepository.save(exame);
	}
	
}
