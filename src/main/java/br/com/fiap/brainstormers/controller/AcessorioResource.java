package br.com.fiap.brainstormers.controller;

import java.util.ArrayList;

import br.com.fiap.brainstormers.model.entity.Acessorio;
import br.com.fiap.brainstormers.model.repository.AcessoriaRepository;
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
	@Path("acessorio/finalizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(@Valid Acessorio acessorio) {
		Acessorio savedAcessorio = AcessoriaRepository.save(acessorio);

		if (savedAcessorio == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok().entity(savedAcessorio).build();
	}
	
	@GET
	@Path("acessorio/{id}")
	public Response findAllById(@PathParam("id") Long id) {
		ArrayList<Acessorio> acessorio = AcessoriaRepository.findAllByIdBicicleta(id);
		ResponseBuilder response = Response.ok();
		response.entity(acessorio);
		return response.build();

	}
	
	@OPTIONS
	@Path("/*")
	public Response options() {
		return Response.ok("").header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.header("Access-Control-Max-Age", "1209600").build();
	}
}
