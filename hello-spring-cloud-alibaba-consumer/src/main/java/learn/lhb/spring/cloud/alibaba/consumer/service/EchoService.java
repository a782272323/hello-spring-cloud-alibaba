package learn.lhb.spring.cloud.alibaba.consumer.service;

import learn.lhb.spring.cloud.alibaba.consumer.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * todo 把该注解的笔记完善了
 * @author 梁鸿斌
 * @date 2020/2/22.
 * @time 18:50
 */
@FeignClient(name = "service-provider",fallback = EchoServiceFallback.class)
@Component
public interface EchoService {

    @GetMapping("/echo/{string}")
    String echo(@PathVariable("string") String string);

    @GetMapping("lb")
    String lb();
}
