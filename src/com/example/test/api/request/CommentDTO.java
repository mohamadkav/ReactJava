package com.example.test.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommentDTO {
	@JsonProperty
	private String author;
	@JsonProperty
	private String text;
	@JsonProperty
	private Long id;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
