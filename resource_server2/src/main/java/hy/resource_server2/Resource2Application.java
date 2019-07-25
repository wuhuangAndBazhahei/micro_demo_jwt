package hy.resource_server2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Project : micro_demo_jwt1
 * @Package Name : hy.resource_server2
 * @Description : TODO
 * @Author : zlj
 * @Creation Date : 2019年07月25日 15:01
 * @ModificationHistory Who        When           What
 * -------------- -------------- ---------------------
 */
@EnableAsync
@EnableFeignClients
@EnableScheduling
@EnableEurekaClient
@SpringBootApplication
public class Resource2Application {
    public static void main(String[] args) {
        SpringApplication.run(Resource2Application.class);
    }
}
