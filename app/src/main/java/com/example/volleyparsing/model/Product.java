package com.example.volleyparsing.model;

import com.google.gson.annotations.SerializedName;

public class Product{

	@SerializedName("cover")
	private String cover;

	@SerializedName("name")
	private String name;

	@SerializedName("sku")
	private String sku;

	public String getCover(){
		return cover;
	}

	public String getName(){
		return name;
	}

	public String getSku(){
		return sku;
	}
}