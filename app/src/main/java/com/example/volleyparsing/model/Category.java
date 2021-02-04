package com.example.volleyparsing.model;

import com.google.gson.annotations.SerializedName;

public class Category{

	@SerializedName("name")
	private String name;

	public String getName(){
		return name;
	}
}