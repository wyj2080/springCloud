package com.example.springCloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wangyinjia
 * @description
 * @date 2020/8/17
 */

@FeignClient(contextId = "TestFeign",url = "127.0.0.1:9090")
public interface TestFeign {
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    void dotest(@RequestBody Object object);
}
