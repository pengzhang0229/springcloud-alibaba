package com.dlys.dao;

import com.dlys.daomain.Order;
import com.dlys.daomain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * OrderDao.
 *
 * @author admin
 */
public interface OrderDao extends JpaRepository<Order, Integer> {
}
