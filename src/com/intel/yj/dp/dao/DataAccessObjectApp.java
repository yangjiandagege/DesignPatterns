package com.intel.yj.dp.dao;

import java.util.ArrayList;
import java.util.List;

import com.intel.yj.dp.Result;

public class DataAccessObjectApp {

	public static void test() {
		final CustomerDaoImpl customerDao = new CustomerDaoImpl(generateSampleCustomers());
		Result.append("customerDao.getAllCustomers(): " + customerDao.getAllCustomers());
		Result.append("customerDao.getCusterById(2): " + customerDao.getCustomerById(2));
		final Customer customer = new Customer(4, "Dan", "Danson");
		customerDao.addCustomer(customer);
		Result.append("customerDao.getAllCustomers(): " + customerDao.getAllCustomers());
		customer.setFirstName("Daniel");
		customer.setLastName("Danielson");
		customerDao.updateCustomer(customer);
		Result.append("customerDao.getAllCustomers(): " + customerDao.getAllCustomers());
		customerDao.deleteCustomer(customer);
		Result.append("customerDao.getAllCustomers(): " + customerDao.getAllCustomers());
	}

	/**
	 * Generate customers.
	 * 
	 * @return list of customers.
	 */
	public static List<Customer> generateSampleCustomers() {
		final Customer customer1 = new Customer(1, "Adam", "Adamson");
		final Customer customer2 = new Customer(2, "Bob", "Bobson");
		final Customer customer3 = new Customer(3, "Carl", "Carlson");
		final List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		return customers;
	}
}
