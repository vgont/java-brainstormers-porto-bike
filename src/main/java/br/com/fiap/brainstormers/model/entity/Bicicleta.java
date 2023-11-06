package br.com.fiap.brainstormers.model.entity;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class Bicicleta {
	private Long idBicicleta;
	
	@NotBlank
	@JsonbProperty("serialNumber")
	private String nrSerieBicicleta;
	
	@NotNull
	@JsonbProperty("idClient")
	private Long idCliente;
	
	@NotBlank
	@JsonbProperty("type")
	private String tipoBicicleta;
	
	@NotBlank
	@JsonbProperty("brand")
	private String marcaBicicleta;
	
	@NotBlank
	@JsonbProperty("model")
	private String modeloBicicleta;
	
	@NotNull
	@PositiveOrZero
	@JsonbProperty("price")
	private Float valorBicicleta;
	
	@PositiveOrZero
	@JsonbProperty("powerInWatts")
	private Float nrPotenciaBicicleta;
	@NotBlank 
	@JsonbProperty("category")
	private String categoriaBicicleta;
	@NotNull
	@PositiveOrZero
	@JsonbProperty("age")
	private Integer tempoUsoAnosBicicleta;
	
	public Bicicleta() {
		
	}

	public Bicicleta(Long idBicicleta, @NotBlank String nrSerieBicicleta, @NotNull Long idCliente,
			@NotBlank String tipoBicicleta, @NotBlank String marcaBicicleta, @NotBlank String modeloBicicleta,
			@NotNull @PositiveOrZero Float valorBicicleta, @PositiveOrZero Float nrPotenciaBicicleta,
			@NotBlank String categoriaBicicleta, @NotNull @PositiveOrZero Integer tempoUsoAnosBicicleta) {
		this.idBicicleta = idBicicleta;
		this.nrSerieBicicleta = nrSerieBicicleta;
		this.idCliente = idCliente;
		this.tipoBicicleta = tipoBicicleta;
		this.marcaBicicleta = marcaBicicleta;
		this.modeloBicicleta = modeloBicicleta;
		this.valorBicicleta = valorBicicleta;
		this.nrPotenciaBicicleta = nrPotenciaBicicleta;
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
		return marcaBicicleta;
	}

	public void setMarcaBicicleta(String marcaBicicleta) {
		this.marcaBicicleta = marcaBicicleta;
	}

	public String getModeloBicicleta() {
		return modeloBicicleta;
	}

	public void setModeloBicicleta(String modeloBicicleta) {
		this.modeloBicicleta = modeloBicicleta;
	}

	public Float getValorBicicleta() {
		return valorBicicleta;
	}

	public void setValorBicicleta(Float valorBicicleta) {
		this.valorBicicleta = valorBicicleta;
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
