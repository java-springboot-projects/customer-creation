package com.bank.app.customer.entity;

import com.bank.app.customer.dto.CustomerDetailsRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * entity class for customer 
 */
@Entity
@Table(name = "CUSTOMER", catalog = "banking_app")
public class Customer
{

	/**
	 * Customer
	 */
	public Customer()
	{

	}
	
	/**
	 * Customer
	 */
	public Customer(CustomerDetailsRequest request)
	{
		this.custName = request.getCustName();
		this.custNumber = request.getCustNumber();
		this.phoneNumber = request.getPhoneNumber();
		this.kycDocNumber = request.getKycDocNumber();
		this.dateOfBirth = request.getDateOfBirth();
	}

	/**
	 * custId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CUST_ID")
	private Long custId;

	/**
	 * custNumber
	 */
	@Column(name = "CUST_NO", nullable = false)
	private String custNumber;

	/**
	 * custName
	 */
	@Column(name = "CUST_NM", nullable = false)
	private String custName;

	/**
	 * dateOfBirth
	 */
	@Column(name = "DOB", nullable = false)
	private String dateOfBirth;

	/**
	 * phoneNumber
	 */
	@Column(name = "PHONE_NO", nullable = false)
	private String phoneNumber;

	/**
	 * kycDocNumber
	 */
	@Column(name = "KYC_DOC_NO", nullable = false)
	private String kycDocNumber;

	/**
	 * @return the custId
	 */
	public Long getCustId()
	{
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(Long custId)
	{
		this.custId = custId;
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
