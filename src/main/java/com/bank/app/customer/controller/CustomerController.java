package com.bank.app.customer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.app.customer.dto.CustomerDetailsRequest;
import com.bank.app.customer.dto.CustomerDetailsResponse;
import com.bank.app.customer.service.CustomerService;

/**
 * Customer controller for creation, 
 * find customer details 
 */
@RestController
@RequestMapping(value = "customer/api/")
public class CustomerController
{
	/**
	 * CustomerService 
	 */
	private final CustomerService customerSvc;

	/**
	 * CustomerController 
	 */
	public CustomerController(CustomerService customerSvc)
	{
		this.customerSvc = customerSvc;
	}

	/**
	 * createCustomer
	 * @param CustomerDetailsRequest
	 * @return CustomerDetailsResponse
	 */
	@PostMapping(value = "createCustomer")
	public ResponseEntity<?> createCustomer(@RequestBody CustomerDetailsRequest request)
	{
		CustomerDetailsResponse response = customerSvc.createCustomer(request);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(response);
	}

	/**
	 * findCustomerByCustNo
	 * @param CustomerDetailsRequest
	 * @return  CustomerDetailsResponse
	 */
	@GetMapping(value = "findCustomer")
	public ResponseEntity<?> findCustomerByCustNo(@RequestBody CustomerDetailsRequest request)
	{
		CustomerDetailsResponse response = customerSvc.findCustomerByCustNo(request);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
