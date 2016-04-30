package com.example.test.api.request;

import javax.ws.rs.core.Response;

import com.example.test.api.GodClass;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GetCustomComments extends BaseRequest {
	public GetCustomComments() {
	}
	public Response handle() {
		ObjectMapper mapper = new ObjectMapper();
    	String json = null;
		try {
			json = mapper.writeValueAsString(GodClass.data);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok(json).build();
	}
}
