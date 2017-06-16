package com.snail.crm.dao;

import java.io.Serializable;

import com.snail.crm.entity.Customer;

/**
 * 数据层接口
 * @author ming
 *
 */
public interface CustomerDao {
	/**
	 * 通过ID查找客户
	 * @param id
	 * @return
	 */
	Customer findById(Long id);
}
