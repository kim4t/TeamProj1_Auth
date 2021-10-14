package bfs.TeamProj_auth.dao;

import bfs.TeamProj_auth.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateUserDao extends AbstractHibernateDAO<User> implements UserDao {
    public HibernateUserDao() {
        setClazz(User.class);
    }

    @Override
    public User getUserById(int id) {
        return findById(id);
    }

    public User getUserByEmail(String email){
        return findByField("email", email);
    }

    @Override
    public User addUser(User user) {
        return create(user);
    }

    @Override
    public User updateUser(User user) {
        return update(user);
    }
}
