package com.example.volleyparsing.model;

import com.google.gson.annotations.SerializedName;

public class StatusCount{

	@SerializedName("new")
	private int jsonMemberNew;

	@SerializedName("activated")
	private int activated;

	public int getJsonMemberNew(){
		return jsonMemberNew;
	}

	public int getActivated(){
		return activated;
	}
}