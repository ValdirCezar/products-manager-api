package com.valdir.products.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long timestamp;
	private String error;
	private Integer status;

	public StandardError() {
		super();
	}

	public StandardError(Long timestamp, String error, Integer status) {
		super();
		this.timestamp = timestamp;
		this.error = error;
		this.status = status;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
