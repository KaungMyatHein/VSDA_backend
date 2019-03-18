package com.pthlab.vsda.API.responses;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pthlab.vsda.Util.ProcessException;
import com.pthlab.vsda.Util.ProcessException.ErrorType;

public class APIUTIL {
	@SuppressWarnings("unchecked")
	public static String formatJsonResponse(@SuppressWarnings("rawtypes") Response response, ProcessException pe)
	{
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		
		if(pe != null)
		{
			response.setResponseCode(pe.getErrorType().getCode());
			//it is error code for multiple error message
			if(ErrorType.MULTIPLE_ERROR.getCode().equalsIgnoreCase(pe.getErrorType().getCode()))
			{
				response.setData(pe.getFieldErrorList());
			}
			else
			{
				response.setResponseMessage(pe.getErrorType().getDescription());
			}
		}
		
		return gson.toJson(response);
	}
}
