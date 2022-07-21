package br.com.medlab.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Exame implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String modalidade;
	private String dataRealizacao;
	private String dataAgendamento;
	private String numero;
	
	@ManyToOne
	@JoinColumn(name = "paciente_id", nullable = false)
	private Paciente paciente;
	
	
	public Exame() {}
	
	public Exame(String nome, String modalidade, String dataRealizacao, String dataAgendamento, String numero) {
		this.nome = nome;
		this.modalidade = modalidade;
		this.dataRealizacao = dataRealizacao;
		this.dataAgendamento = dataAgendamento;
		this.numero = numero;
		
	}
}
