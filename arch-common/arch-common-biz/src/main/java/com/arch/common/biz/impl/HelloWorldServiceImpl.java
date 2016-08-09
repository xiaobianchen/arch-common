package com.arch.common.biz.impl;

import com.arch.common.api.service.HelloService;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Component;

/**
 * Created by chenxiaobian on 16/7/10.
 */

@Component
@Log4j
public class HelloWorldServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
