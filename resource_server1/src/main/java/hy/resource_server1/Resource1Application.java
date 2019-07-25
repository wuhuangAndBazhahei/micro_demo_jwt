package hy.resource_server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Project : micro_demo_jwt1
 * @Package Name : hy.resource_server1
 * @Description : TODO
 * @Author : zlj
 * @Creation Date : 2019年07月25日 14:29
 * @ModificationHistory Who        When           What
 * -------------- -------------- ---------------------
 */
@EnableEurekaClient
@SpringBootApplication
public class Resource1Application {
    public static void main(String[] args) {
        SpringApplication.run(Resource1Application.class);
    }
}
