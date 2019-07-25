package hy.auth_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 微服务之间直接调用的认证中心
 * @author yinjihuan
 *
 */
@SpringBootApplication
//@EnableDiscoveryClient 其他注册中心推荐使用
@EnableEurekaClient   //eureka推荐使用
public class AuthApplication {
	public static void main(String[] args) {
	    SpringApplication.run(AuthApplication.class, args);
	}
}
