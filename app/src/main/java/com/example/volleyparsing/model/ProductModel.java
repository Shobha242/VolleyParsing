package com.example.volleyparsing.model;

import com.google.gson.annotations.SerializedName;

public class ProductModel{

	@SerializedName("data")
	private Data data;

	public Data getData(){
		return data;
	}
}