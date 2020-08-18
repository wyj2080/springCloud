package com.example.springCloud;

import org.springframework.web.bind.annotation.*;

/**
 * @author wangyinjia
 * @description
 * @date 2020/8/17
 */
@RequestMapping("")
@RestController
public class Test {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public void test(@RequestBody Object object) throws Exception {
        System.out.println(object.toString());
    }
}
