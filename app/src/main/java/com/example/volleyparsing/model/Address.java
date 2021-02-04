package com.example.volleyparsing.model;

import com.google.gson.annotations.SerializedName;

public class Address{

	@SerializedName("area")
	private Area area;

	@SerializedName("pincode")
	private Pincode pincode;

	@SerializedName("contact_name")
	private String contactName;

	@SerializedName("address_1")
	private String address1;

	@SerializedName("address_2")
	private String address2;

	@SerializedName("alias")
	private String alias;

	@SerializedName("full_address")
	private String fullAddress;

	public Area getArea(){
		return area;
	}

	public Pincode getPincode(){
		return pincode;
	}

	public String getContactName(){
		return contactName;
	}

	public String getAddress1(){
		return address1;
	}

	public String getAddress2(){
		return address2;
	}

	public String getAlias(){
		return alias;
	}

	public String getFullAddress(){
		return fullAddress;
	}
}