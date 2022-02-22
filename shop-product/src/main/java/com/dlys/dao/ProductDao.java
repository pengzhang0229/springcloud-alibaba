package com.dlys.dao;

import com.dlys.daomain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ProductDao.
 *
 * @author admin
 */
public interface ProductDao extends JpaRepository<Product, Integer> {
}
