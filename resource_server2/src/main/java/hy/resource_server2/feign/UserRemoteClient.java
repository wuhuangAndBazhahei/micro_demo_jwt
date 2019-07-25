package hy.resource_server2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**  
 * 认证服务API调用客户端   
 * @author yinjihuan  
 * 
 **/ 
@FeignClient(value = "resource-server1")
public interface UserRemoteClient {
	
   @GetMapping("/user/hello") 
   String hello(); 
   
}