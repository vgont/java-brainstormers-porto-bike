package br.com.fiap.brainstormers.model.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class Modificacao {
	@NotNull
	private Long idModificacao;
	@NotNull
	private Long idBicicleta;
	@NotBlank
	private String nrNotaFiscalModificacao;
	@NotBlank
	private String nomeModificacao;
	@PositiveOrZero
	private Float nrValorModificacao;
	
	public Modificacao(@NotNull Long idModificacao, @NotNull Long idBicicleta, @NotBlank String nrNotaFiscalModificacao,
			@NotBlank String nomeModificacao, @PositiveOrZero Float nrValorModificacao) {
		super();
		this.idModificacao = idModificacao;
		this.idBicicleta = idBicicleta;
		this.nrNotaFiscalModificacao = nrNotaFiscalModificacao;
		this.nomeModificacao = nomeModificacao;
		this.nrValorModificacao = nrValorModificacao;
	}

	public Long getIdModificacao() {
		return idModificacao;
	}

	public void setIdModificacao(Long idModificacao) {
		this.idModificacao = idModificacao;
	}

	public Long getIdBicicleta() {
		return idBicicleta;
	}

	public void setIdBicicleta(Long idBicicleta) {
		this.idBicicleta = idBicicleta;
	}

	public String getNrNotaFiscalModificacao() {
		return nrNotaFiscalModificacao;
	}

	public void setNrNotaFiscalModificacao(String nrNotaFiscalModificacao) {
		this.nrNotaFiscalModificacao = nrNotaFiscalModificacao;
	}

	public String getNomeModificacao() {
		return nomeModificacao;
	}

	public void setNomeModificacao(String nomeModificacao) {
		this.nomeModificacao = nomeModificacao;
	}

	public Float getNrValorModificacao() {
		return nrValorModificacao;
	}

	public void setNrValorModificacao(Float nrValorModificacao) {
		this.nrValorModificacao = nrValorModificacao;
	}
	
	
	
}
