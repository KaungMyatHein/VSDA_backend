package com.pthlab.vsda.API.responses;

import java.io.Serializable;

public class Response<T> implements Serializable{


	private static final long serialVersionUID = -2399388017779506119L;
	private String responseCode;
	private String responseMessage;
	private T data;
	
	public String getResponseCode() 
	{
		return responseCode;
	}
	
	public void setResponseCode(String responseCode) 
	{
		this.responseCode = responseCode;
	}
	
	public String getResponseMessage() 
	{
		return responseMessage;
	}
	
	public void setResponseMessage(String responseMessage) 
	{
		this.responseMessage = responseMessage;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
