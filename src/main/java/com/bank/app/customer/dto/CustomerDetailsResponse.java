package com.bank.app.customer.dto;

import com.bank.app.customer.entity.Customer;

/**
 * DTO class for find customer details 
 */
public class CustomerDetailsResponse
{
	/**
	 *custName
	 */
	private String custName;

	/**
	 *custNumber
	 */
	private String dateOfBirth;

	/**
	 *phoneNumber
	 */
	private String phoneNumber;

	/**
	 *kycDocNumber
	 */
	private String kycDocNumber;

	/**
	 *custNumber
	 */
	private String custNumber;

	/**
	 *CustomerDetailsResponse
	 */
	public CustomerDetailsResponse(Customer customer)
	{
		this.custNumber = customer.getCustNumber();
		this.phoneNumber = customer.getPhoneNumber();
		this.kycDocNumber = customer.getKycDocNumber();
		this.dateOfBirth = customer.getDateOfBirth();
		this.custName = customer.getCustName();
	}

	/**
	 * @return the custName
	 */
	public String getCustName()
	{
		return custName;
	}

	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName)
	{
		this.custName = custName;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth()
	{
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the kycDocNumber
	 */
	public String getKycDocNumber()
	{
		return kycDocNumber;
	}

	/**
	 * @param kycDocNumber the kycDocNumber to set
	 */
	public void setKycDocNumber(String kycDocNumber)
	{
		this.kycDocNumber = kycDocNumber;
	}

	/**
	 * @return the custNumber
	 */
	public String getCustNumber()
	{
		return custNumber;
	}

	/**
	 * @param custNumber the custNumber to set
	 */
	public void setCustNumber(String custNumber)
	{
		this.custNumber = custNumber;
	}

}
