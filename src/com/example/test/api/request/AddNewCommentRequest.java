package com.example.test.api.request;

import java.io.IOException;

import javax.ws.rs.core.Response;

import com.example.test.api.GodClass;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AddNewCommentRequest extends BaseRequest{
	private CommentDTO dto;
	public AddNewCommentRequest(String request){
		try {
			dto= new ObjectMapper().readValue(request, CommentDTO.class);
		} catch (IOException e) {
			e.printStackTrace();
			throw new NullPointerException("Could not build the Comment object!");
		}
	}
	@Override
	public Response handle() {
		GodClass.data.add(dto);
		return new GetCustomComments().handle();
	}
	
}
