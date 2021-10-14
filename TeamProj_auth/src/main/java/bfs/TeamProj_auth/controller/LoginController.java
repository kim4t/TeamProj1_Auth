package bfs.TeamProj_auth.controller;

import bfs.TeamProj_auth.domain.User;
import bfs.TeamProj_auth.security.CookieUtil;
import bfs.TeamProj_auth.security.JwtUtil;
import bfs.TeamProj_auth.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@RestController
public class LoginController {
    private LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    private static final String jwtTokenCookieName = "JWT-TOKEN";
    private static final String signingKey = "signingKey";

    public LoginController() {}

    @PostMapping("/login")
    public String login(HttpServletResponse httpServletResponse, String userName, String password, String redirect, Model model) {
        String userStatus = loginService.validateLogin(userName, password);

        if(userStatus.equals("Invalid password")){
            return userStatus;
        }
        else if(userStatus.equals("Invalid userName")){
            return userStatus;
        }
        else{
            String token = JwtUtil.generateToken(signingKey, userName);
            CookieUtil.create(httpServletResponse, jwtTokenCookieName, token, false, -1, "localhost");
            return userStatus;
        }

    }

}
