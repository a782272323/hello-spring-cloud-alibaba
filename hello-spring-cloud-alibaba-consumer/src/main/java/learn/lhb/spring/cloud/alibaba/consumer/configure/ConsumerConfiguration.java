package learn.lhb.spring.cloud.alibaba.consumer.configure;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 梁鸿斌
 * @date 2020/2/22.
 * @time 15:54
 */
@Configuration
public class ConsumerConfiguration {
    @Bean
    @LoadBalanced// 开启负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
