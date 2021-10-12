package bfs.TeamProj_auth.service;

import bfs.TeamProj_auth.dao.LoginDao;
import bfs.TeamProj_auth.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    private LoginDao loginDao;
    private Optional<User> user;

    @Autowired
    public LoginService(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    public Optional<User> validateLogin(String username, String password) {
        user = loginDao.validateLogin(username, password);
        return user;
        //return loginDao.validateLogin(username, password);
    }

    public Optional<User> getCurrentUser(){return user;}
}
