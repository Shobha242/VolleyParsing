package com.example.volleyparsing.model;

import com.google.gson.annotations.SerializedName;

public class PaginatorInfo{

	@SerializedName("total")
	private int total;

	@SerializedName("perPage")
	private int perPage;

	@SerializedName("lastPage")
	private int lastPage;

	@SerializedName("lastItem")
	private int lastItem;

	@SerializedName("count")
	private int count;

	@SerializedName("hasMorePages")
	private boolean hasMorePages;

	@SerializedName("firstItem")
	private int firstItem;

	@SerializedName("currentPage")
	private int currentPage;

	public int getTotal(){
		return total;
	}

	public int getPerPage(){
		return perPage;
	}

	public int getLastPage(){
		return lastPage;
	}

	public int getLastItem(){
		return lastItem;
	}

	public int getCount(){
		return count;
	}

	public boolean isHasMorePages(){
		return hasMorePages;
	}

	public int getFirstItem(){
		return firstItem;
	}

	public int getCurrentPage(){
		return currentPage;
	}
}