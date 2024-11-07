package com.bank.app.customer.service;

import com.bank.app.customer.dto.CustomerDetailsRequest;
import com.bank.app.customer.dto.CustomerDetailsResponse;


/**
 * Customer Service 
 */
public interface CustomerService
{
	/**
	 * createCustomer
	* @param CustomerDetailsRequest
	 * @return CustomerDetailsResponse
	 */
	public CustomerDetailsResponse createCustomer(CustomerDetailsRequest request);

	/**
	 * findCustomerByCustNo
	 * @param CustomerDetailsRequest
	 * @return CustomerDetailsResponse
	 */
	public CustomerDetailsResponse findCustomerByCustNo(CustomerDetailsRequest request);

}
