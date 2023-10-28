package br.com.fiap.brainstormers.model.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class Bicicleta {
	@NotNull
	private Long idBicicleta;
	@NotBlank
	private String nrSerieBicicleta;
	@NotBlank
	private String nrNotaFiscalBicicleta;
	@NotNull
	private Long idCliente;
	@NotBlank
	private String tipoBicicleta;
	@NotBlank
	private String nmMarcaBicicleta;
	@NotBlank
	private String nmModeloBicicleta;
	@PositiveOrZero
	private Float nrValorBicicleta;
	@PositiveOrZero
	private Float nrPotenciaBicicleta;
	@NotBlank
	private String categoriaBicicleta;
	@PositiveOrZero
	private Integer tempoUsoAnosBicicleta;
	
	//Bicicleta com o numero da potencia (eletrica)
	public Bicicleta(@NotNull Long idBicicleta, @NotBlank String nrSerieBicicleta,
			@NotBlank String nrNotaFiscalBicicleta, @NotNull Long idCliente, @NotBlank String tipoBicicleta,
			@NotBlank String nmMarcaBicicleta, @NotBlank String nmModeloBicicleta,
			@PositiveOrZero Float nrValorBicicleta, @PositiveOrZero Float nrPotenciaBicicleta,
			@NotBlank String categoriaBicicleta, @PositiveOrZero Integer tempoUsoAnosBicicleta) {
		this.idBicicleta = idBicicleta;
		this.nrSerieBicicleta = nrSerieBicicleta;
		this.nrNotaFiscalBicicleta = nrNotaFiscalBicicleta;
		this.idCliente = idCliente;
		this.tipoBicicleta = tipoBicicleta;
		this.nmMarcaBicicleta = nmMarcaBicicleta;
		this.nmModeloBicicleta = nmModeloBicicleta;
		this.nrValorBicicleta = nrValorBicicleta;
		this.nrPotenciaBicicleta = nrPotenciaBicicleta;
		this.categoriaBicicleta = categoriaBicicleta;
		this.tempoUsoAnosBicicleta = tempoUsoAnosBicicleta;
	}
	
	//Bicicleta sem numero da potencia
	public Bicicleta(@NotNull Long idBicicleta, @NotBlank String nrSerieBicicleta,
			@NotBlank String nrNotaFiscalBicicleta, @NotNull Long idCliente, @NotBlank String tipoBicicleta,
			@NotBlank String nmMarcaBicicleta, @NotBlank String nmModeloBicicleta,
			@PositiveOrZero Float nrValorBicicleta, @NotBlank String categoriaBicicleta,
			@PositiveOrZero Integer tempoUsoAnosBicicleta) {
		this.idBicicleta = idBicicleta;
		this.nrSerieBicicleta = nrSerieBicicleta;
		this.nrNotaFiscalBicicleta = nrNotaFiscalBicicleta;
		this.idCliente = idCliente;
		this.tipoBicicleta = tipoBicicleta;
		this.nmMarcaBicicleta = nmMarcaBicicleta;
		this.nmModeloBicicleta = nmModeloBicicleta;
		this.nrValorBicicleta = nrValorBicicleta;
		this.categoriaBicicleta = categoriaBicicleta;
		this.tempoUsoAnosBicicleta = tempoUsoAnosBicicleta;
	}
	
	public Long getIdBicicleta() {
		return idBicicleta;
	}
	public void setIdBicicleta(Long idBicicleta) {
		this.idBicicleta = idBicicleta;
	}
	public String getNrSerieBicicleta() {
		return nrSerieBicicleta;
	}
	public void setNrSerieBicicleta(String nrSerieBicicleta) {
		this.nrSerieBicicleta = nrSerieBicicleta;
	}
	public String getNrNotaFiscalBicicleta() {
		return nrNotaFiscalBicicleta;
	}
	public void setNrNotaFiscalBicicleta(String nrNotaFiscalBicicleta) {
		this.nrNotaFiscalBicicleta = nrNotaFiscalBicicleta;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public String getTipoBicicleta() {
		return tipoBicicleta;
	}
	public void setTipoBicicleta(String tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}
	public String getNmMarcaBicicleta() {
		return nmMarcaBicicleta;
	}
	public void setNmMarcaBicicleta(String nmMarcaBicicleta) {
		this.nmMarcaBicicleta = nmMarcaBicicleta;
	}
	public String getNmModeloBicicleta() {
		return nmModeloBicicleta;
	}
	public void setNmModeloBicicleta(String nmModeloBicicleta) {
		this.nmModeloBicicleta = nmModeloBicicleta;
	}
	public Float getNrValorBicicleta() {
		return nrValorBicicleta;
	}
	public void setNrValorBicicleta(Float nrValorBicicleta) {
		this.nrValorBicicleta = nrValorBicicleta;
	}
	public Float getNrPotenciaBicicleta() {
		return nrPotenciaBicicleta;
	}
	public void setNrPotenciaBicicleta(Float nrPotenciaBicicleta) {
		this.nrPotenciaBicicleta = nrPotenciaBicicleta;
	}
	public String getCategoriaBicicleta() {
		return categoriaBicicleta;
	}
	public void setCategoriaBicicleta(String categoriaBicicleta) {
		this.categoriaBicicleta = categoriaBicicleta;
	}
	public Integer getTempoUsoAnosBicicleta() {
		return tempoUsoAnosBicicleta;
	}
	public void setTempoUsoAnosBicicleta(Integer tempoUsoAnosBicicleta) {
		this.tempoUsoAnosBicicleta = tempoUsoAnosBicicleta;
	}

	
}
