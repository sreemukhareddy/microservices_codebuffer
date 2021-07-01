package com.dailycodebuffer.user;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig
{
    @Bean
    @LoadBalanced
    public RestTemplate customRestTemplate()
    {
    	RestTemplate restTemplate = new RestTemplate();
    	((SimpleClientHttpRequestFactory)restTemplate.getRequestFactory()).setConnectTimeout(3000);
    	return restTemplate;
    }
}