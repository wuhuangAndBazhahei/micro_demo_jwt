package hy.zuul_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Project : micro_demo_jwt1
 * @Package Name : hy.zuul_server
 * @Description : TODO
 * @Author : zlj
 * @Creation Date : 2019年07月25日 13:15
 * @ModificationHistory Who        When           What
 * -------------- -------------- ---------------------
 */
@EnableFeignClients
@EnableScheduling
@EnableZuulProxy
@SpringBootApplication
public class ZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class);
    }
}
