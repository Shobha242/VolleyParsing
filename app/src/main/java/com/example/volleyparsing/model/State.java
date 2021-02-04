package com.example.volleyparsing.model;

import com.google.gson.annotations.SerializedName;

public class State{

	@SerializedName("country")
	private Country country;

	@SerializedName("name")
	private String name;

	public Country getCountry(){
		return country;
	}

	public String getName(){
		return name;
	}
}