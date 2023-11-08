package br.com.fiap.brainstormers.controller;

import java.util.ArrayList;

import br.com.fiap.brainstormers.model.entity.Modificacao;
import br.com.fiap.brainstormers.model.repository.ModificacaoRepository;
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
public class ModificacaoResource {
	
	@POST
	@Path("modificacoes")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(@Valid Modificacao modificacao) {
		Modificacao savedModificacao = ModificacaoRepository.save(modificacao);

		if (savedModificacao == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.created(null).entity(savedModificacao).build();
	}
	
	@GET
	@Path("modificacao/{idBicicleta}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAllById(@PathParam("idBicicleta") Long idBicicleta) {
		ArrayList<Modificacao> modificacao= ModificacaoRepository.findAllByIdBicicleta(idBicicleta);
				
		ResponseBuilder response = Response.ok();
		if(modificacao == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		response.entity(modificacao);
		return response.build();
	}
}
