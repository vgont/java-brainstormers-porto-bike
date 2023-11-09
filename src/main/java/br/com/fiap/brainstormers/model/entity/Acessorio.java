package br.com.fiap.brainstormers.model.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class Acessorio {
	private Long idAcessorio;
	@NotNull
	private Long idBicicleta;
	@NotBlank
	private String nomeAcessorio;
	@PositiveOrZero
	private Float valorAcessorio;
	
	public Acessorio() {
	}

	public Acessorio(Long idAcessorio, @NotNull Long idBicicleta, @NotBlank String nomeAcessorio,
			@PositiveOrZero Float valorAcessorio) {
		this.idAcessorio = idAcessorio;
		this.idBicicleta = idBicicleta;
		this.nomeAcessorio = nomeAcessorio;
		this.valorAcessorio = valorAcessorio;
	}

	public Long getIdAcessorio() {
		return idAcessorio;
	}

	public void setIdAcessorio(Long idAcessorio) {
		this.idAcessorio = idAcessorio;
	}

	public Long getIdBicicleta() {
		return idBicicleta;
	}

	public void setIdBicicleta(Long idBicicleta) {
		this.idBicicleta = idBicicleta;
	}

	public String getNomeAcessorio() {
		return nomeAcessorio;
	}

	public void setNomeAcessorio(String nomeAcessorio) {
		this.nomeAcessorio = nomeAcessorio;
	}

	public Float getValorAcessorio() {
		return ValorAcessorio;
	}

	public void setValorAcessorio(Float valorAcessorio) {
		this.valorAcessorio = valorAcessorio;
	}	
}
