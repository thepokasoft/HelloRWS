package com.poka.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/math")
public class SimpleMath {
	
	@GET
	@Path("/add/{a}/{b}")
	@Produces(MediaType.TEXT_PLAIN)
	public int add(@PathParam("a")int a, @PathParam("b")int b)
	{
		return(a+b);
	}

}
