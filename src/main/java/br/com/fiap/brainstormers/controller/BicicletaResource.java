package br.com.fiap.brainstormers.controller;

import br.com.fiap.brainstormers.model.entity.Bicicleta;
import br.com.fiap.brainstormers.model.repository.BicicletaRepository;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/vistoria")
public class BicicletaResource {

	@POST
	@Path("/finalizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(@Valid Bicicleta bicicleta) {
		Bicicleta savedBicicleta = BicicletaRepository.save(bicicleta);
		
		if (savedBicicleta == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response
			      .status(200)
			      .header("Access-Control-Allow-Origin", "*")
			      .header("Access-Control-Allow-Credentials", "true")
			      .header("Access-Control-Allow-Headers",
			        "origin, content-type, accept, authorization")
			      .header("Access-Control-Allow-Methods", 
			        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
			      .entity(savedBicicleta)
			      .build();
	}

}
