package com.snail.crm.dao.impl;

import java.io.Serializable;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.snail.crm.dao.CustomerDao;
import com.snail.crm.entity.Customer;

/**
 * 实现类
 * @author ming
 *
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
	@Override
	public Customer findById(Long id) {
		return this.getHibernateTemplate().get(Customer.class, id);
	}
}
