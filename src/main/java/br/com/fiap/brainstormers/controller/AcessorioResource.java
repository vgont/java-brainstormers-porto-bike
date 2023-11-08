package br.com.fiap.brainstormers.controller;

import java.util.ArrayList;

import br.com.fiap.brainstormers.model.entity.Acessorio;
import br.com.fiap.brainstormers.model.repository.AcessorioRepository;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.OPTIONS;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;

public class AcessorioResource {
	
	@POST
	@Path("vistoria/finalizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(@Valid Acessorio acessorio) {
		Acessorio savedAcessorio = AcessorioRepository.save(acessorio);

		if (savedAcessorio == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.created(null).entity(savedAcessorio).build();
	}
	
	@GET
	@Path("acessorio/{idBicicleta}")
	public Response findAllById(@PathParam("idBicicleta") Long idBicicleta) {
		ArrayList<Acessorio> acessorio = AcessorioRepository.findAllByIdBicicleta(idBicicleta);
		ResponseBuilder response = Response.ok();
		if (acessorio == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		
		response.entity(acessorio);
		return response.build();

	}
}
