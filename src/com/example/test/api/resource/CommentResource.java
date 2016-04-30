package com.example.test.api.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.example.test.api.request.AddNewCommentRequest;
import com.example.test.api.request.GetCustomComments;


@Path("/comments/")
public class CommentResource {
	@GET
	@Path("/all/")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAllUserinfoRequest(){
		return new GetCustomComments().handle();
	}
	@POST
	@Path("/all/")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addNewComment(String requestJson){
		return new AddNewCommentRequest(requestJson).handle();
	}
}
