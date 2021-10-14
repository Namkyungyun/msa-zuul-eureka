package com.namkyung.workservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class WorkServiceController {

    @Value("${userinfo.name}")
    private String configName;

    @Value("${userinfo.age}")
    private String configAge;

    @Value("${userinfo.phone}")
    private String configTel;

    @GetMapping("/work")
    public String getWork(){
        String first = "Hello, {" + configName + "}!\n\n";
        String second = "I Check your info\n\n your age : {" + configAge + "},\n your phoneNumber : {" + configTel + "}";
        String third = "\n\nRight?";
        return first + second + third;
    }

}
