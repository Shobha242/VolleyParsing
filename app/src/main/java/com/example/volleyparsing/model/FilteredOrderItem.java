package com.example.volleyparsing.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class FilteredOrderItem{

	@SerializedName("no")
	private String no;

	@SerializedName("address")
	private Address address;

	@SerializedName("under_warranty")
	private boolean underWarranty;

	@SerializedName("inititated_by")
	private String inititatedBy;

	@SerializedName("documents")
	private List<Object> documents;

	@SerializedName("active")
	private boolean active;

	@SerializedName("warrantyleft")
	private int warrantyleft;

	@SerializedName("dealer_location_id")
	private int dealerLocationId;

	@SerializedName("location")
	private Location location;

	@SerializedName("id")
	private int id;

	@SerializedName("detail")
	private Detail detail;

	@SerializedName("purchase_date")
	private String purchaseDate;

	@SerializedName("serial_no")
	private String serialNo;

	@SerializedName("user")
	private User user;

	@SerializedName("status")
	private String status;

	public String getNo(){
		return no;
	}

	public Address getAddress(){
		return address;
	}

	public boolean isUnderWarranty(){
		return underWarranty;
	}

	public String getInititatedBy(){
		return inititatedBy;
	}

	public List<Object> getDocuments(){
		return documents;
	}

	public boolean isActive(){
		return active;
	}

	public int getWarrantyleft(){
		return warrantyleft;
	}

	public int getDealerLocationId(){
		return dealerLocationId;
	}

	public Location getLocation(){
		return location;
	}

	public int getId(){
		return id;
	}

	public Detail getDetail(){
		return detail;
	}

	public String getPurchaseDate(){
		return purchaseDate;
	}

	public String getSerialNo(){
		return serialNo;
	}

	public User getUser(){
		return user;
	}

	public String getStatus(){
		return status;
	}
}