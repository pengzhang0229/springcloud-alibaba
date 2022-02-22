package com.dlys.controller;

import com.dlys.daomain.Order;
import com.dlys.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * OrderController.
 *
 * @author admin
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/prod/{pid}")
    public Order order(@PathVariable("pid") Integer pid) {
        return orderService.save(pid);
    }
}
