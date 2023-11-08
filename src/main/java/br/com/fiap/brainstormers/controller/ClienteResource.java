package br.com.fiap.brainstormers.controller;

import br.com.fiap.brainstormers.model.entity.Cliente;
import br.com.fiap.brainstormers.model.repository.ClienteRepository;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.OPTIONS;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/")
public class ClienteResource {
	@POST
	@Path("cliente/finalizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(@Valid Cliente cliente) {
		Cliente savedCliente = ClienteRepository.save(cliente);

		if (savedCliente == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.created(null).entity(savedCliente).build();
	}
}
