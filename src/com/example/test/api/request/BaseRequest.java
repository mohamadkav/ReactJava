package com.example.test.api.request;

import javax.ws.rs.core.Response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class BaseRequest {
	private static ObjectMapper mapper;

	@JsonIgnore
	public abstract Response handle();
	
	
	public static BaseRequest buildRequest(String requestJson , Class<? extends BaseRequest> requestClass){
		if(mapper == null)
			mapper = new ObjectMapper();
		BaseRequest request = null;
		try {
			request = mapper.readValue(requestJson, requestClass);
		}catch(Exception e){
			e.printStackTrace();
		}
		return request;
	}
}
