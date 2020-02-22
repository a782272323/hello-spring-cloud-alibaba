package learn.lhb.spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 梁鸿斌
 * @date 2020/2/22.
 * @time 15:29
 */
@RestController
public class EchoController {

    @Value("${server.port}")
    private String port;

    @GetMapping("lb")
    public String lb()  {
        return "Hello Nacos Provider, i am from port" + port;
    }

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable(value = "string") String string)    {
        return "Hello Nacos Provider " + string;
    }
}
