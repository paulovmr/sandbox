package com.sandbox.users;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/users")
public class UserResource {
	
	@Inject
	private UserDAO users;
	
	@GET
	@Path("/{id}")
	public Response getUser(@PathParam("id") Long id) {
		return Response.status(Status.OK).entity(users.searchUser()).build();
	}

}
