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
	private String nomeModificacao;
	@PositiveOrZero
	private Float ValorModificacao;
	
	public Modificacao(@NotNull Long idModificacao, @NotNull Long idBicicleta, @NotBlank String nomeModificacao,
			@PositiveOrZero Float valorModificacao) {
		this.idModificacao = idModificacao;
		this.idBicicleta = idBicicleta;
		this.nomeModificacao = nomeModificacao;
		ValorModificacao = valorModificacao;
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

	public String getNomeModificacao() {
		return nomeModificacao;
	}

	public void setNomeModificacao(String nomeModificacao) {
		this.nomeModificacao = nomeModificacao;
	}

	public Float getValorModificacao() {
		return ValorModificacao;
	}

	public void setValorModificacao(Float valorModificacao) {
		ValorModificacao = valorModificacao;
	}
	
	
	
	
}
