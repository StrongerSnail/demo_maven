package com.snail.crm.service.impl;

import com.snail.crm.dao.CustomerDao;
import com.snail.crm.entity.Customer;
import com.snail.crm.service.CustomerService;

/**
 * 业务层实现类
 * @author ming
 *
 */
public class CustomerServiceImpl implements CustomerService {
	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public Customer findByUserId(Long id) {
		return customerDao.findById(id);
	}
}
