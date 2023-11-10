package br.com.fiap.brainstormers.controller;

import java.util.ArrayList;

import br.com.fiap.brainstormers.model.entity.Bicicleta;
import br.com.fiap.brainstormers.model.repository.BicicletaRepository;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;

@Path("/")
public class BicicletaResource {

	@POST
	@Path("vistoria/finalizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(@Valid Bicicleta bicicleta) {
		Bicicleta savedBicicleta = BicicletaRepository.save(bicicleta);

		if (savedBicicleta == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.created(null).entity(savedBicicleta).build();
	}

	@GET
	@Path("bikes/{idCliente}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAllById(@PathParam("idCliente") Long idCliente) {
		ArrayList<Bicicleta> bike = BicicletaRepository.findAllByIdCliente(idCliente);
		ResponseBuilder response = Response.ok();

		if (bike == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		
		response.entity(bike);
		return response.build();

	}
}
