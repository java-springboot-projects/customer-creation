package com.bank.app.customer.dto;

/**
 * DTO class for find customer details 
 */
public class CustomerDetailsRequest
{

	/**
	 * customer name
	 */
	private String custName;

	/**
	 * dateOfBirth
	 */
	private String dateOfBirth;

	/**
	 * phoneNumber
	 */
	private String phoneNumber;

	/**
	 * kyc Doucment Number
	 */
	private String kycDocNumber;

	/**
	 * customer Number
	 */
	private String custNumber;


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
	
}
