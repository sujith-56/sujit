package com.example.demo.model;

 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightResponse {
    private Pagination pagination;  // Add this field
    private List<Flight> data;

    // Getters and setters
    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<Flight> getData() {
        return data;
    }

    public void setData(List<Flight> data) {
        this.data = data;
    }
}

// Define Pagination class
class Pagination {
    private int total;
    private int count;
    private int limit;
    private int offset;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}

    // Getters and setters
}
