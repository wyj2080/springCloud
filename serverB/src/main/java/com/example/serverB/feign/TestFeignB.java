package com.example.serverB.feign;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(contextId = "TestFeignB",value = "serverA")
public interface TestFeignB {
    @PostMapping(value = "/test/put")
    void dotest(@RequestBody JSONObject object);
}
