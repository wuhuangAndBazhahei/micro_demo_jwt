package hy.common_server.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hy.common_server.common.ResponseCode;
import hy.common_server.common.ResponseData;
import hy.common_server.util.JWTUtils;
import hy.common_server.util.JsonUtils;
import org.springframework.util.StringUtils;



/**
 * API 调用权限控制
 * @author yinjihuan
 *
 */
public class HttpBasicAuthorizeFilter implements Filter {

	JWTUtils jwtUtils = JWTUtils.getInstance();

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;  
        httpResponse.setCharacterEncoding("UTF-8");    
        httpResponse.setContentType("application/json; charset=utf-8"); 
        String auth = httpRequest.getHeader("Authorization");
        //验证TOKEN
		if (!StringUtils.hasText(auth)) {
			PrintWriter print = httpResponse.getWriter();
			print.write(JsonUtils.toJson(ResponseData.fail("非法请求【缺少Authorization信息】", ResponseCode.NO_AUTH_CODE.getCode())));
			return;
		}
		JWTUtils.JWTResult jwt = jwtUtils.checkToken(auth);
		if (!jwt.isStatus()) {
			PrintWriter print = httpResponse.getWriter();
			print.write(JsonUtils.toJson(ResponseData.fail(jwt.getMsg(), jwt.getCode())));
			return;
		}
		chain.doFilter(httpRequest, response);
	}
	
	@Override
	public void destroy() {
		
	}

}
