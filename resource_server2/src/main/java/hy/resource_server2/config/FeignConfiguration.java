package hy.resource_server2.config;

import hy.resource_server2.interceptor.FeignBasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FeignConfiguration {
	/**
	 * 创建Feign请求拦截器，在发送请求前设置认证的token,各个微服务将token设置 到环境变量中来达到通用
	 * 
	 * @return
	 */
	@Bean
	public FeignBasicAuthRequestInterceptor basicAuthRequestInterceptor() {
		return new FeignBasicAuthRequestInterceptor();
	}
}
