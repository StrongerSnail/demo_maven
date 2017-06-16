package com.snail.crm.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.snail.crm.entity.Customer;
import com.snail.crm.service.CustomerService;

/**
 * 控制类
 * @author ming
 *
 */
public class CustomerAction extends ActionSupport {

	private Long custID;
	
	public Long getCustID() {
		return custID;
	}

	public void setCustID(Long custID) {
		this.custID = custID;
	}

	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public String findByUserId(){
		customer = customerService.findByUserId(custID);
		return SUCCESS;
	}
	
}
