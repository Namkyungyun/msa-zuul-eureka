package com.namkyung.zuul.server;

import com.namkyung.zuul.server.filter.PostFilter;
import com.namkyung.zuul.server.filter.PreFilter;
import com.namkyung.zuul.server.filter.RouteFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
@EnableZuulProxy
@RefreshScope
public class ZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);

    }

    @Bean
    public PreFilter preFilter(){
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter(){
        return new PostFilter();
    }
    @Bean
    public RouteFilter routeFilter(){
        return new RouteFilter();
    }
}
