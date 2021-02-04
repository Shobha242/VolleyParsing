package com.example.volleyparsing.model;

import com.google.gson.annotations.SerializedName;

public class Pincode{

	@SerializedName("pincode")
	private int pincode;

	@SerializedName("city")
	private City city;

	public int getPincode(){
		return pincode;
	}

	public City getCity(){
		return city;
	}
}