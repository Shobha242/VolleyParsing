package com.example.volleyparsing.model;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("name")
	private String name;

	@SerializedName("mobile")
	private String mobile;

	@SerializedName("username")
	private String username;

	public String getName(){
		return name;
	}

	public String getMobile(){
		return mobile;
	}

	public String getUsername(){
		return username;
	}
}