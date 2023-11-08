package br.com.fiap.brainstormers.controller;

import br.com.fiap.brainstormers.model.entity.Cliente;
import br.com.fiap.brainstormers.model.repository.ClienteRepository;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/")
public class ClienteResource {
	
	@GET
	@Path("clientes/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAllById(@PathParam("id") Long idCliente) {
		Cliente savedCliente = ClienteRepository.findAllById(idCliente);

		if (savedCliente == null) {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		return Response.created(null).entity(savedCliente).build();
	}
}
