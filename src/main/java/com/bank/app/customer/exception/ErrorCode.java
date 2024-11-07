package com.bank.app.customer.exception;

/**
 * ErrorCode for customer exception 
 */
public class ErrorCode
{

	/**
	 * ErrorCode for missing customer number 
	 */
	public static final String ERROR_MISSING_CUST_NO = "Customer number missing";

	/**
	 * ErrorCode for customer details not found customer number
	 */
	public static final String CUSTOMER_DETAIL_NOT_FOUND = "Customer detail not found for given customer number";

	/**
	 * ErrorCode for missing customer name 
	 */
	public static final String ERROR_MISSING_CUST_NM = "Customer name missing";

	/**
	 * ErrorCode for missing customer phone number 
	 */
	public static final String ERROR_MISSING_PHONE_NO = "Customer phone number missing";

	/**
	 * ErrorCode for missing customer Date of Birth 
	 */
	public static final String ERROR_MISSING_DOB = "Customer Date of Birth missing";

	/**
	 * ErrorCode for missing customer kyc document number
	 */
	public static final String ERROR_MISSING_KYC_DOC_NO = "Customer kyc document number missing";

	/**
	 * ErrorCode for existing customer record
	 */
	public static final String ERROR_CUSTOMER_EXISTS = "Customer already exists";
}
