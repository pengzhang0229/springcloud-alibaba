package com.dlys.service.impl;

import com.alibaba.fastjson.JSON;
import com.dlys.dao.OrderDao;
import com.dlys.daomain.Order;
import com.dlys.daomain.Product;
import com.dlys.manager.ProductManager;
import com.dlys.manager.ProductService;
import com.dlys.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * OrderServiceImpl.
 *
 * @author admin
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductManager productManager;

    @Autowired
    private ProductService productService;


    @Override
    public Order save(Integer pid) {
//        Product product = productManager.getProductById(pid);
        Product product = productService.findByPid(pid);
        log.info(">>商品信息,查询结果:" + JSON.toJSONString(product));
        Order order = new Order();
        order.setUid(1);
        order.setUsername("测试用户");
        order.setPid(product.getPid());
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        order.setNumber(1);
        return orderDao.save(order);
    }
}
