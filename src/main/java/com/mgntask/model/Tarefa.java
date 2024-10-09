package com.mgntask.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
@Table(name = "tarefa")
public class Tarefa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private String titulo;
	
	
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "responsavel_id")
	@Enumerated(EnumType.STRING)
	private String responsavel;
	
	@ManyToOne
	@Enumerated(EnumType.STRING)
	private Prioridade prioridade;
	
	@Temporal(TemporalType.DATE)
	private Date deadline;
}
