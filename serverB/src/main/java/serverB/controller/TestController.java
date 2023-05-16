package serverB.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.serverB.feign.TestFeignB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestFeignB testFeign;

    @RequestMapping("/get")
    public void get() {
        JSONObject jsonObject = new JSONObject();
        JSONObject item = new JSONObject();
        item.put("key1", "33dd");
        item.put("key2", "44dd");
        jsonObject.put("name", "aaa");
        jsonObject.put("item", item);
        testFeign.dotest(jsonObject);
    }
}