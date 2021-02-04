package com.example.volleyparsing.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Detail{

	@SerializedName("installation_required")
	private boolean installationRequired;

	@SerializedName("product")
	private Product product;

	@SerializedName("name")
	private String name;

	@SerializedName("history_summary")
	private List<Object> historySummary;

	@SerializedName("requests")
	private List<Object> requests;

	@SerializedName("category")
	private Category category;

	@SerializedName("brand")
	private Brand brand;

	@SerializedName("warrantees")
	private List<Object> warrantees;

	public boolean isInstallationRequired(){
		return installationRequired;
	}

	public Product getProduct(){
		return product;
	}

	public String getName(){
		return name;
	}

	public List<Object> getHistorySummary(){
		return historySummary;
	}

	public List<Object> getRequests(){
		return requests;
	}

	public Category getCategory(){
		return category;
	}

	public Brand getBrand(){
		return brand;
	}

	public List<Object> getWarrantees(){
		return warrantees;
	}
}