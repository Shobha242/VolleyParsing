package com.example.volleyparsing.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DealerProductsFilter{

	@SerializedName("filtered_order")
	private List<FilteredOrderItem> filteredOrder;

	@SerializedName("paginatorInfo")
	private PaginatorInfo paginatorInfo;

	@SerializedName("responseInfo")
	private ResponseInfo responseInfo;

	@SerializedName("status_count")
	private StatusCount statusCount;

	public List<FilteredOrderItem> getFilteredOrder(){
		return filteredOrder;
	}

	public PaginatorInfo getPaginatorInfo(){
		return paginatorInfo;
	}

	public ResponseInfo getResponseInfo(){
		return responseInfo;
	}

	public StatusCount getStatusCount(){
		return statusCount;
	}
}