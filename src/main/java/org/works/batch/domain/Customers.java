package org.works.batch.domain;

import java.io.Serializable;
import java.util.List;

public class Customers implements Serializable {

	private List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}
