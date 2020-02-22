package learn.lhb.spring.cloud.alibaba.consumer.service.fallback;

import learn.lhb.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @author 梁鸿斌
 * @date 2020/2/23.
 * @time 01:09
 */
@Component
public class EchoServiceFallback implements EchoService {

    @Override
    public String echo(String string) {
        return "你的网络有问题";
    }

    @Override
    public String lb() {
        return "你的网络有问题！！！";
    }
}
