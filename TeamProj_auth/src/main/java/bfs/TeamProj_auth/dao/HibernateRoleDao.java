package bfs.TeamProj_auth.dao;

import bfs.TeamProj_auth.domain.Role;
import bfs.TeamProj_auth.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class HibernateRoleDao extends AbstractHibernateDAO<Role> implements RoleDao{
    public HibernateRoleDao(){setClazz(Role.class);}
    @Override
    public List<Role> getAllRole() {
        return null;
    }

    @Override
    public Role getRoleById(int id) {
        return findById(id);
    }

    @Override
    public Role addRole(Role role) {
        return null;
    }

    @Override
    public Role getRoleByName(String name) {
        return null;
    }
}
