package com.namkyung.zuul.server.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@RefreshScope
@Configuration
public class PreFilter extends ZuulFilter {


    @Value("${should.value}")
    private boolean shouldVal;

    private String Filter_Type = "pre";
    private int Filter_Order = 1;


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
        return shouldVal;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        System.out.println("###PRE_filter 동작###");
        System.out.println("###요청한 url : " + ctx.getRequest().getRequestURI());

        return null;
    }

}
