/**
 * 
 */
package com.lt.application;

import com.lt.business.CustomerBusiness;

/**
 * @author user206
 *
 */
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerBusiness cd=new CustomerBusiness();
		cd.createCustomer();
		//cd.deleteCustomer();
//		cd.listCustomer();
		//cd.updateCustomer();

	}

}
