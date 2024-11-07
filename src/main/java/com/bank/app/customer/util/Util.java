package com.bank.app.customer.util;

/**
 * Utility class
 */
public class Util
{

	/**
	 * isNullorBlank
	 * @param String
	 * @return boolean
	 */
	public static boolean isNullorBlank(String arg)
	{
		return (arg == null || arg.trim().length() == 0);
	}
}
