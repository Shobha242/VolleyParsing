package com.example.volleyparsing.model;

import com.google.gson.annotations.SerializedName;

public class Location{

	@SerializedName("address")
	private Address address;

	@SerializedName("name")
	private String name;

	@SerializedName("dealer")
	private Dealer dealer;

	@SerializedName("id")
	private String id;

	public Address getAddress(){
		return address;
	}

	public String getName(){
		return name;
	}

	public Dealer getDealer(){
		return dealer;
	}

	public String getId(){
		return id;
	}
}