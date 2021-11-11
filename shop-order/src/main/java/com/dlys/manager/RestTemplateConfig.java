package com.dlys.manager;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplateConfig.
 *
 * @author admin
 */
@Configuration
public class RestTemplateConfig {
    /**
     * '@LoadBalanced'注解表示使用Ribbon实现客户端负载均衡
     * @return RestTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
