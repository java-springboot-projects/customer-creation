package com.bank.app.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.app.customer.entity.Customer;

/**
 * Customer repository for creation, 
 * find customer details 
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{

	/**
	 * findCustomerByCustNumber
	 * @param String
	 * @return  Customer
	 */
	public Customer findCustomerByCustNumber(String customerNumber);
}
