package learn.lhb.spring.cloud.alibaba.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 梁鸿斌
 * @date 2020/2/22.
 * @time 15:23
 */
@SpringBootApplication
@EnableDiscoveryClient // todo 把这个注解的解释整合多一个spring cloud alibaba
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
