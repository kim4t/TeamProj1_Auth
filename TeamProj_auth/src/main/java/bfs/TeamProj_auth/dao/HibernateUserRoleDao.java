package bfs.TeamProj_auth.dao;

import bfs.TeamProj_auth.domain.Role;
import bfs.TeamProj_auth.domain.UserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernateUserRoleDao extends AbstractHibernateDAO<UserRole> implements UserRoleDao {
    public HibernateUserRoleDao() {
        setClazz(UserRole.class);
    }

    @Override
    public UserRole addUserRole(UserRole userRole) {
        return null;
    }

    @Override
    public UserRole getUserRoleByUserId(int userId) {
        return findById(userId);
    }

    @Override
    public List<UserRole> getAllUserRole() {
        return findAll();
    }
}
