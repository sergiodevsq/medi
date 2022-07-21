package br.com.medlab.repositories;

import org.springframework.stereotype.Repository;

import br.com.medlab.models.Paciente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;





@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
	
	
	
}
