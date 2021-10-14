package bfs.TeamProj_auth.service;

import bfs.TeamProj_auth.dao.RoleDao;
import bfs.TeamProj_auth.dao.UserDao;
import bfs.TeamProj_auth.dao.UserRoleDao;
import bfs.TeamProj_auth.domain.Role;
import bfs.TeamProj_auth.domain.User;
import bfs.TeamProj_auth.domain.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class LoginService {

    private UserDao userDao;
    private UserRoleDao userRoleDao;
    private RoleDao roleDao;

    @Autowired
    public LoginService(UserDao userDao, UserRoleDao userRoleDao, RoleDao roleDao) {
        this.userDao = userDao;
        this.userRoleDao = userRoleDao;
        this.roleDao = roleDao;
    }

    @Transactional
    public String validateLogin(String username, String password) {
        Optional<User> user = Optional.ofNullable(userDao.getUserByName(username));
        if(user.isPresent()){
            if(user.get().getPassword().equals(password)){
                int userId = user.get().getId();
                Optional<UserRole> userRole = userRoleDao.getAllUserRole().stream().filter(u -> u.getUser().getId().equals(userId)).findAny();
                if(userRole.isPresent()){
                    int roleId = userRole.get().getRole().getId();
                    return roleDao.getRoleById(roleId).getRoleName();
                }
                System.out.println("it is null");
                return "error";
            }
            else{
                return "Invalid password";
            }
        }
        return "Invalid userName";

    }

}
