package hy.resource_server2.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * Feign请求拦截器
 * 
 * @author yinjihuan
 *
 **/
public class FeignBasicAuthRequestInterceptor implements RequestInterceptor {
	public FeignBasicAuthRequestInterceptor() {
		
	}

	@Override
	public void apply(RequestTemplate template) {
		template.header("Authorization", System.getProperty("fangjia.auth.token"));
	}
}