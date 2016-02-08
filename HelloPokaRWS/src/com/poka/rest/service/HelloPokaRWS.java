package com.poka.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/helo")
public class HelloPokaRWS {
	
	@GET
	@Path("/{message}")
	public Response getMessage(@PathParam("message") String message){
		
		String output="Welcome "+message;
		
		return Response.status(200).entity(output).build();
		
	}

}
