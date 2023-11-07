package br.com.fiap.brainstormers.controller;

import java.util.ArrayList;

import br.com.fiap.brainstormers.model.entity.Modificacao;
import br.com.fiap.brainstormers.model.repository.ModificacaoRepository;
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

@Path("/")
public class ModificacaoResource {
	@POST
	@Path("modificacao/finalizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(@Valid Modificacao modificacao) {
		Modificacao savedModificacao = ModificacaoRepository.save(modificacao);

		if (savedModificacao == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok().entity(savedModificacao).build();
	}
	
	@GET
	@Path("modificacao/{id}")
	public Response findAllById(@PathParam("id") Long id) {
		ArrayList<Modificacao> modificacao= ModificacaoRepository.findAllByIdBicicleta(id);
		ResponseBuilder response = Response.ok();
		response.entity(modificacao);
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
