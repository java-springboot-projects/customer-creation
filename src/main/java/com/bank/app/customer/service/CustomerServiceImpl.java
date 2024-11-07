package com.bank.app.customer.service;

import org.springframework.stereotype.Service;

import com.bank.app.customer.dao.CustomerRepository;
import com.bank.app.customer.dto.CustomerDetailsRequest;
import com.bank.app.customer.dto.CustomerDetailsResponse;
import com.bank.app.customer.entity.Customer;
import com.bank.app.customer.exception.CustomerException;
import com.bank.app.customer.exception.ErrorCode;
import com.bank.app.customer.util.Util;

/**
 * Customer Service Implementation
 */
@Service
public class CustomerServiceImpl implements CustomerService
{

	/**
	 * CustomerRepository
	 */
	private final CustomerRepository customerRepo;

	/**
	 * CustomerServiceImpl
	 */
	public CustomerServiceImpl(CustomerRepository customerRepo)
	{
		this.customerRepo = customerRepo;
	}
	
	/**
	 * createCustomer
	 * @param CustomerDetailsRequest
	 * @return CustomerDetailsResponse
	 */
	@Override
	public CustomerDetailsResponse createCustomer(CustomerDetailsRequest request)
	{
		if(Util.isNullorBlank(request.getCustName()))
		{
			throw new CustomerException(ErrorCode.ERROR_MISSING_CUST_NM);
		}
		if(Util.isNullorBlank(request.getPhoneNumber()))
		{
			throw new CustomerException(ErrorCode.ERROR_MISSING_PHONE_NO);
		}
		if(Util.isNullorBlank(request.getKycDocNumber()))
		{
			throw new CustomerException(ErrorCode.ERROR_MISSING_KYC_DOC_NO);
		}
		if(Util.isNullorBlank(request.getDateOfBirth()))
		{
			throw new CustomerException(ErrorCode.ERROR_MISSING_DOB);
		}
		
		Customer existingCustomer = customerRepo.findCustomerByCustNumber(request.getCustNumber());
		if(existingCustomer != null)
		{
			throw new CustomerException(ErrorCode.ERROR_CUSTOMER_EXISTS);
		}
		
		Customer customer = new Customer(request);
		customerRepo.save(customer);
		CustomerDetailsResponse response = new CustomerDetailsResponse(customer);
		return response;
	}

	/**
	 * findCustomerByCustNo
	 * @param CustomerDetailsRequest
	 * @return CustomerDetailsResponse
	 */
	@Override
	public CustomerDetailsResponse findCustomerByCustNo(CustomerDetailsRequest request)
	{
		if (Util.isNullorBlank(request.getCustNumber()))
		{
			throw new CustomerException(ErrorCode.ERROR_MISSING_CUST_NO);
		}
		Customer customer = customerRepo.findCustomerByCustNumber(request.getCustNumber());
		if (customer == null)
		{
			throw new CustomerException(ErrorCode.CUSTOMER_DETAIL_NOT_FOUND);
		}
		CustomerDetailsResponse response = new CustomerDetailsResponse(customer);
		return response;
	}

}
