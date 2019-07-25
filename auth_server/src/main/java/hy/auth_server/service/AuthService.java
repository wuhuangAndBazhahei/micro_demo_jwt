package hy.auth_server.service;


import hy.auth_server.po.User;
import hy.auth_server.query.AuthQuery;

public interface AuthService {

	User auth(AuthQuery query);
	
}
