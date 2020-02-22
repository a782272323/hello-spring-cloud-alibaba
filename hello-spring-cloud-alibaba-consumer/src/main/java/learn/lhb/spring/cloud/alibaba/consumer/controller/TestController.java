package learn.lhb.spring.cloud.alibaba.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 梁鸿斌
 * @date 2020/2/22.
 * @time 15:55
 */
@RestController
public class TestController {
    private final RestTemplate restTemplate;
    @Autowired
    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable String str) {
        // 使用服务名请求服务提供者
        System.out.println("1111");
        return restTemplate.getForObject("http://service-provider/echo/" + str, String.class);
    }
}