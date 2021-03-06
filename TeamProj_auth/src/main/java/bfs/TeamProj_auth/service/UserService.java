package bfs.TeamProj_auth.service;

import bfs.TeamProj_auth.dao.UserDao;
import bfs.TeamProj_auth.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserService {
    @Autowired
    private UserDao userDao;


    @Transactional
    public User addUser(User user) {
        return userDao.addUser(user);
    }

    @Transactional
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Transactional
    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    @Transactional
    public User updateUser(User user) {
        return userDao.updateUser(user);
    }
}
