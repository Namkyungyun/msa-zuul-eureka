package com.namkyung.zuul.server.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;


@RefreshScope
@Configuration
public class PostFilter extends ZuulFilter {


    private static String Filter_Type = "post";
    private static int Filter_Order = 1;

    @Value("${should.value}")
    private boolean Should_Filter;



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

        System.out.println(Should_Filter);
        return Should_Filter;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        System.out.println("###POST_filter 동작###");
        return null;
    }

}
