package bfs.TeamProj_auth.dao;

import bfs.TeamProj_auth.domain.Role;

import java.util.List;

public interface RoleDao {
    List<Role> getAllRole();

    Role getRoleById(int id);

    Role addRole(Role role);

    Role getRoleByName(String name);
}
