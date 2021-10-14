package com.namkyung.zuul.server.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class RouteFilter extends ZuulFilter {

    private static  String Filter_Type = "route";
    private static int Filter_Order = 1;
    private static boolean Should_Filter = true;



    @Override
    public String filterType() {
        return Filter_Type;
    }

    @Override
    public int filterOrder() {
        return Filter_Order;
    }

    @Override
    public boolean shouldFilter() {
        return Should_Filter;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("###ROUTE_filter 동작###");
        return null;
    }

}
