package com.teste.hospede.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "telefone", nullable = false, length = 100)
	private String telefone;
	
	@Column(name = "cpf", nullable = false, length = 100)
	private String cpf;
	
	@Column(name = "rg", nullable = false, length = 100)
	private String rg;
}
