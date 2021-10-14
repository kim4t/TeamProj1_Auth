package bfs.TeamProj_auth.dao;

import bfs.TeamProj_auth.domain.UserRole;

import java.util.List;

public interface UserRoleDao {
    UserRole addUserRole(UserRole userRole);
    UserRole getUserRoleByUserId(int userId);
    List<UserRole> getAllUserRole();
}
