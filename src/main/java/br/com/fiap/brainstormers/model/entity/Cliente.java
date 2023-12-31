package br.com.fiap.brainstormers.model.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Cliente {
	private Long idCliente;
	@NotBlank
	private String emailCliente;
	@NotBlank
	private String senhaCliente;
	
	
	public Cliente() {
	}

	public Cliente(@NotNull Long idCliente, @NotBlank String emailCliente,
			@NotBlank String senhaCliente) {
		this.idCliente = idCliente;
		this.emailCliente = emailCliente;
		this.senhaCliente = senhaCliente;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
	
	
	
}
