package com.example.volleyparsing.model;

import com.google.gson.annotations.SerializedName;

public class ResponseInfo{

	@SerializedName("message")
	private String message;

	@SerializedName("error")
	private String error;

	@SerializedName("status")
	private int status;

	public String getMessage(){
		return message;
	}

	public String getError(){
		return error;
	}

	public int getStatus(){
		return status;
	}
}