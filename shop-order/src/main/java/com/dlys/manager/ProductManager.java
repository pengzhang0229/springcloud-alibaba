package com.dlys.manager;

import com.alibaba.fastjson.JSON;
import com.dlys.daomain.Product;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * ProductManager.
 *
 * @author admin
 */
@Component
@Slf4j
public class ProductManager {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    public Product getProductById(Integer pid) {

        //直接使用微服务名字， 从nacos中获取服务地址
        String url = "service-product";

        log.info(">>从nacos中获取到的微服务地址为:http://" + url + "/product/" );
        //通过restTemplate调用商品微服务
        Product product = restTemplate.getForObject("http://" + url +
                "/product/" + pid, Product.class);
        log.info(">>商品信息，查询结果:" + JSON.toJSONString(product));

        return product;
    }
}
