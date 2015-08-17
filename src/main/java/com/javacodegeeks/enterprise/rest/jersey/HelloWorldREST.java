package com.javacodegeeks.enterprise.rest.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/helloWorldREST")
public class HelloWorldREST {

	@GET
	@Path("/get")
	public Response getTrack() {

		Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");

		return Response.status(200).entity(track.toString()).build();
	}
	
	@POST
	@Path("/post")
	public Response createTrack(Track track) {
		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
		
	}

}