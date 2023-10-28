package br.com.fiap.brainstormers.model.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class Acessorio {
	@NotNull
	private Long idAcessorio;
	@NotNull
	private Long idBicicleta;
	@NotBlank
	private String nrNotaFiscalAcessorio;
	@NotBlank
	private String nomeAcessorio;
	@PositiveOrZero
	private Float nrValorAcessorio;
	
	public Acessorio(@NotNull Long idAcessorio, @NotNull Long idBicicleta, @NotBlank String nrNotaFiscalAcessorio,
			@NotBlank String nomeAcessorio, @PositiveOrZero Float nrValorAcessorio) {	
		this.idAcessorio = idAcessorio;
		this.idBicicleta = idBicicleta;
		this.nrNotaFiscalAcessorio = nrNotaFiscalAcessorio;
		this.nomeAcessorio = nomeAcessorio;
		this.nrValorAcessorio = nrValorAcessorio;
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

	public String getNrNotaFiscalAcessorio() {
		return nrNotaFiscalAcessorio;
	}

	public void setNrNotaFiscalAcessorio(String nrNotaFiscalAcessorio) {
		this.nrNotaFiscalAcessorio = nrNotaFiscalAcessorio;
	}

	public String getNomeAcessorio() {
		return nomeAcessorio;
	}

	public void setNomeAcessorio(String nomeAcessorio) {
		this.nomeAcessorio = nomeAcessorio;
	}

	public Float getNrValorAcessorio() {
		return nrValorAcessorio;
	}

	public void setNrValorAcessorio(Float nrValorAcessorio) {
		this.nrValorAcessorio = nrValorAcessorio;
	}
	
	
}
