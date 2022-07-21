package br.com.medlab;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import br.com.medlab.models.Exame;
import br.com.medlab.models.Paciente;
import br.com.medlab.repositories.ExameRepository;
import br.com.medlab.repositories.PacienteRepository;

@EntityScan("br.com.medlab.models")
@SpringBootApplication
public class MedilabApplication implements CommandLineRunner {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Autowired
	private ExameRepository exameRepository;

	public static void main(String[] args) {
		SpringApplication.run(MedilabApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		exameRepository.deleteAll();
		pacienteRepository.deleteAll();
		
		Paciente p1 = new Paciente(null, "Carlos Eduardo");
		Paciente p2 = new Paciente(null, "Juliana Medeiros");
		Paciente p3 = new Paciente(null, "Vitor Lemos");
		pacienteRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		Exame e1 = new Exame("ANGIO-RM ARTERIAL DE ABDOMEN", "RM", "20/10/2021", "20/10/2021", "457234-1");
		Exame e2 = new Exame("ANGIO-RM ARTERIAL DE ABDOMEN", "RM", "20/10/2021", "20/10/2021", "457234-1");
		Exame e3 = new Exame("ANGIO-RM ARTERIAL DE ABDOMEN", "RM", "20/10/2021", "20/10/2021", "457234-1");
		Exame e4 = new Exame("ANGIO-RM ARTERIAL DE ABDOMEN", "RM", "20/10/2021", "20/10/2021", "457234-1");
		Exame e5 = new Exame("ANGIO-RM ARTERIAL DE ABDOMEN", "RM", "20/10/2021", "20/10/2021", "457234-1");
		Exame e6 = new Exame("ANGIO-RM ARTERIAL DE ABDOMEN", "RM", "20/10/2021", "20/10/2021", "457234-1");
		
		e1.setPaciente(p1);
		e2.setPaciente(p2);
		e3.setPaciente(p3);
		e4.setPaciente(p1);
		e5.setPaciente(p2);
		e6.setPaciente(p3);
		exameRepository.saveAll(Arrays.asList(e1,e2, e3, e4, e5, e6));
	}

}
