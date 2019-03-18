package com.pthlab.vsda.Util;

import java.io.Serializable;
import java.util.List;

import org.springframework.validation.FieldError;

public class ProcessException implements Serializable{

	private static final long serialVersionUID = 1519900408342597475L;

	private ErrorType errorType;
	
	private List<FieldError> fieldErrorList;
	
	public ProcessException(ErrorType errorType)
	{
		super();
		
		this.setErrorType(errorType);
	}
	
	public enum ErrorType
	{
		GENERAL("-1","General application exception occurred while processing user request."),
		LOGIN_FAIL("-1","Email and password don't match!"),
		INVALID_DATA("-1","Invalid Data"),
		MULTIPLE_ERROR("1000", ""),
		INVALID_SESSION("1001","Invalid Session!"),
		DIFFERENT_EXCHANGE_RATE("1002","Exchange rate has been changed. Do you want to buy this pass plan?"),
		REJECT_CHECKIN("-1","Check_in is not applicable anymore. Please upgrade application."),
		REJECT_CANCEL("-1","Cancel is not applicable anymore. Please upgrade application."),
		BOOKING_DATE_NOT_EXISTS("1022","There is no bookable class date."),
		BALANCE_NOT_ENOUGH_IN_PASS_PLAN("1023","Pass plan amount is not enough book all class that tie with plan."),
		NO_REMAINING_BAL("1024","Please top up balance to give rating."),
		NO_USED_BOOKING("1025","Please make a booking and use the booking at this place first before giving a rating."),
		NOT_ALLOW_CANCEL("1026"," class is not allowed to cancel."),
		OVER_BOOKING_ADVANCE_TIME("1027","Class advance time is already over so you cannot book that class! Please book another one."),
		OVER_BOOKING_START_TIME("1028","Class start time is already over so you cannot book that class! Please book another one."),
		EXCEED_MAX_NO_OF_PEOPLE_BOOKING("1029","The number of people allow to book this class is exceeded."),
		INVALID_REDEEM_PROMO_CODE("1031","Your inputted promotion code is valid only to use with pass plan."),
		REQUIRED_PROMO_CODE("1032","Promotion code is required"),
		POINT_REDEEM_VALID_FOR_PASSPLAN("1033","Your inputted promocode is valid only to use when you purchase plan."),
		POINT_REDEEM_VALID_FOR_ACTIVE_CUSTOMER("1034","Your inputted promocode is valid only for Active account"),
		POINT_REDEEM_VALID_FOR_NONACTIVE_CUSTOMER("1035","Your inputted promocode is valid only for Non-active account"),
		POINT_REDEEM_INVALID_VALIDITY("1036","Promcode does not have validity."),
		CLASS_DATE_EXISTS_IN_STUDIO_CLOSED_DATE("1042","Class Date exists between studio closed date."),
		INVALID_PARTNER_FOR_BOOKING("1043","Login partner is invalid to scan this booking."),
		BOOKING_NOT_EXIST("1044","Booking does not exist."),
		BOOKING_ALREADY_USED("1045","Booking has already used.");
		
		
		private ErrorType(String iCode, String idescription)
		{
			code = iCode;
	    	description = idescription;
		}
		
		 public String getCode()
		 { return code; }	 
		
		 
		 public void setDescription(String description) {
			this.description = description;
		}

		public String getDescription()
		 { return description; }
		
		private final String code;
	    private String description;
	    
	    
	}
	
	public ErrorType getErrorType() {
		return errorType;
	}

	public void setErrorType(ErrorType errorType) {
		this.errorType = errorType;
	}

	public List<FieldError> getFieldErrorList() {
		return fieldErrorList;
	}

	public void setFieldErrorList(List<FieldError> fieldErrorList) {
		this.fieldErrorList = fieldErrorList;
	}
	
}
