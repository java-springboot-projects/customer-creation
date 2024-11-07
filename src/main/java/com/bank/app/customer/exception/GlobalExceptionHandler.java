package com.bank.app.customer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Global Exception Handler class for handling Customer Exception 
 */
@ControllerAdvice
public class GlobalExceptionHandler
{

	/**
	 * handleAllException
	 * @return ResponseEntity
	 * @param CustomerException
	 */
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<?> handleAllException(CustomerException exeception)
	{
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exeception.getMessage());
	}
}
