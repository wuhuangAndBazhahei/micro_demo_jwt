package hy.resource_server2.feign;

import hy.common_server.common.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**  
 * 认证服务API调用客户端   
 * @author yinjihuan  
 * 
 **/ 
@FeignClient(value = "auth-server", path = "/oauth")
public interface AuthRemoteClient {
	
  /**      
   * 调用认证,获取token      
   * @param query      
   * @return      
   */ 
   @PostMapping("/token")
   ResponseData auth(@RequestBody AuthQuery query);
   
}