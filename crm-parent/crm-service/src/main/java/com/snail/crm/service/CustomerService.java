package com.snail.crm.service;

import com.snail.crm.entity.Customer;

/**
 * 业务层接口
 * @author ming
 *
 */
public interface CustomerService {
	/**
	 * 通过ID查找
	 * @param id
	 * @return
	 */
	public Customer  findByUserId(Long id);
}
