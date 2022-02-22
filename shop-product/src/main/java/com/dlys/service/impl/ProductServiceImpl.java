package com.dlys.service.impl;

import com.alibaba.fastjson.JSON;
import com.dlys.dao.ProductDao;
import com.dlys.daomain.Product;
import com.dlys.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductServiceImpl.
 *
 * @author admin
 */
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product findByPid(Integer pid) {
        Product product = productDao.findById(pid).get();
        log.info("查询到商品:" + JSON.toJSONString(product));
        return product;
    }
}
