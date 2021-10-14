package bfs.TeamProj_auth.dao;

import bfs.TeamProj_auth.domain.User;

public interface UserDao {
    User getUserById(int id);

    User getUserByEmail(String email);

    User addUser(User user);

    User updateUser(User user);

    User getUserByName(String userName);
}
