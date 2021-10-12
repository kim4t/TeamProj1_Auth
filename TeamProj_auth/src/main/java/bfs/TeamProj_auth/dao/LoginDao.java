package bfs.TeamProj_auth.dao;

import bfs.TeamProj_auth.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class LoginDao {
    JdbcTemplate jdbcTemplate;
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Optional<User> validateLogin(String username, String password) {
        String sql = "Select* from User";
        List<User> users =  jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        return users.stream().filter(a -> a.getUserName().equals(username) && a.getPassword().equals(password)).findAny();
    }
}
