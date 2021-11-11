package com.dlys.service;

import com.dlys.daomain.Product;

/**
 * ProductService.
 *
 * @author admin
 */
public interface ProductService {
    Product findByPid(Integer pid);
}
