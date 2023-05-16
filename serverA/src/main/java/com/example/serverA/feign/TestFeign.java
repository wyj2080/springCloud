package com.example.serverA.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(contextId = "TestFeign",value = "server2")
public interface TestFeign {
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    void dotest(@RequestBody Object object);
}
