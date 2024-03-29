package hy.resource_server1.config;

import java.util.ArrayList;
import java.util.List;

import hy.common_server.filter.HttpBasicAuthorizeFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public FilterRegistrationBean<HttpBasicAuthorizeFilter> filterRegistrationBean() {
		FilterRegistrationBean<HttpBasicAuthorizeFilter> registrationBean = new FilterRegistrationBean<HttpBasicAuthorizeFilter>();
		HttpBasicAuthorizeFilter httpBasicFilter = new HttpBasicAuthorizeFilter();
		registrationBean.setFilter(httpBasicFilter);
		List<String> urlPatterns = new ArrayList<String>(1);
		urlPatterns.add("/*");
		registrationBean.setUrlPatterns(urlPatterns);
		return registrationBean;
	}
	
}
