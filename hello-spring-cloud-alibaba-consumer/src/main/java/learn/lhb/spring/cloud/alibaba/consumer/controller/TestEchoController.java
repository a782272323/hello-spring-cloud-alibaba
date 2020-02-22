package learn.lhb.spring.cloud.alibaba.consumer.controller;

import learn.lhb.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 梁鸿斌
 * @date 2020/2/22.
 * @time 18:49
 */
@RefreshScope
@RestController
public class TestEchoController {

    @Autowired
    private EchoService echoService;

    @Value("${user.name}")
    private String username;

    @GetMapping("/feign/echo/{str}")
    public String echo(@PathVariable("str") String str)  {
        return echoService.echo(str);
    }

    @GetMapping("/lb")
    public String lb()  {
        return echoService.lb();
    }

    @GetMapping("/config")
    public String echo()    {
        return echoService.echo(username);
    }

}
