package com.zpc.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced //开启负载均衡，进行服务间调用
    public RestTemplate restTemplate(){

//        return new RestTemplate();
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }

}
