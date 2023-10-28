package br.com.fiap.brainstormers.model.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class Bicicleta {
	@NotNull
	private Long idBicicleta;
	@NotBlank
	private String nrSerieBicicleta;
	@NotNull
	private Long idCliente;
	@NotBlank
	private String tipoBicicleta;
	@NotBlank
	private String MarcaBicicleta;
	@NotBlank
	private String ModeloBicicleta;
	@PositiveOrZero
	private Float ValorBicicleta;
	@PositiveOrZero
	private Float nrPotenciaBicicleta;
	@NotBlank
	private String categoriaBicicleta;
	@PositiveOrZero
	private Integer tempoUsoAnosBicicleta;
	
	//Bicicleta com o numero da potencia (eletrica)
	public Bicicleta(@NotNull Long idBicicleta, @NotBlank String nrSerieBicicleta, @NotNull Long idCliente,
			@NotBlank String tipoBicicleta, @NotBlank String marcaBicicleta, @NotBlank String modeloBicicleta,
			@PositiveOrZero Float valorBicicleta, @PositiveOrZero Float nrPotenciaBicicleta,
			@NotBlank String categoriaBicicleta, @PositiveOrZero Integer tempoUsoAnosBicicleta) {
		this.idBicicleta = idBicicleta;
		this.nrSerieBicicleta = nrSerieBicicleta;
		this.idCliente = idCliente;
		this.tipoBicicleta = tipoBicicleta;
		MarcaBicicleta = marcaBicicleta;
		ModeloBicicleta = modeloBicicleta;
		ValorBicicleta = valorBicicleta;
		this.nrPotenciaBicicleta = nrPotenciaBicicleta;
		this.categoriaBicicleta = categoriaBicicleta;
		this.tempoUsoAnosBicicleta = tempoUsoAnosBicicleta;
	}

	//Bicicleta sem numero da potencia
	public Bicicleta(@NotNull Long idBicicleta, @NotBlank String nrSerieBicicleta, @NotNull Long idCliente,
			@NotBlank String tipoBicicleta, @NotBlank String marcaBicicleta, @NotBlank String modeloBicicleta,
			@PositiveOrZero Float valorBicicleta, @NotBlank String categoriaBicicleta,
			@PositiveOrZero Integer tempoUsoAnosBicicleta) {
		super();
		this.idBicicleta = idBicicleta;
		this.nrSerieBicicleta = nrSerieBicicleta;
		this.idCliente = idCliente;
		this.tipoBicicleta = tipoBicicleta;
		MarcaBicicleta = marcaBicicleta;
		ModeloBicicleta = modeloBicicleta;
		ValorBicicleta = valorBicicleta;
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

	public String getMarcaBicicleta() {
		return MarcaBicicleta;
	}

	public void setMarcaBicicleta(String marcaBicicleta) {
		MarcaBicicleta = marcaBicicleta;
	}

	public String getModeloBicicleta() {
		return ModeloBicicleta;
	}

	public void setModeloBicicleta(String modeloBicicleta) {
		ModeloBicicleta = modeloBicicleta;
	}

	public Float getValorBicicleta() {
		return ValorBicicleta;
	}

	public void setValorBicicleta(Float valorBicicleta) {
		ValorBicicleta = valorBicicleta;
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
