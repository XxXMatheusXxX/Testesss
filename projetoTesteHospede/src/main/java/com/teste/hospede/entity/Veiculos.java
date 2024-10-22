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
public class Veiculos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "marca", nullable = false, length = 100)
	private String marca;
	
	@Column(name = "modelo", nullable = false, length = 100)
	private String modelo;
	
	@Column(name = "cpf", nullable = false, length = 100)
	private int ano;
	
	@Column(name = "rg", nullable = false, length = 100)
	private String cor;
}
