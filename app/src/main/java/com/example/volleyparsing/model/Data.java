package com.example.volleyparsing.model;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("dealer_products_filter")
	private DealerProductsFilter dealerProductsFilter;

	public DealerProductsFilter getDealerProductsFilter(){
		return dealerProductsFilter;
	}
}