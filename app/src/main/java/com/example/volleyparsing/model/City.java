package com.example.volleyparsing.model;

import com.google.gson.annotations.SerializedName;

public class City{

	@SerializedName("name")
	private String name;

	@SerializedName("state")
	private State state;

	public String getName(){
		return name;
	}

	public State getState(){
		return state;
	}
}