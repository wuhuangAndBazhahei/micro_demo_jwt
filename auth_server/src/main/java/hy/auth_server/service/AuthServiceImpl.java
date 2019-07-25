package hy.auth_server.service;

import hy.auth_server.po.User;
import hy.auth_server.query.AuthQuery;
import org.springframework.stereotype.Service;


@Service
public class AuthServiceImpl implements AuthService {

	@Override
	public User auth(AuthQuery query) {
		return new User(1L);
	}

}
