package bfs.TeamProj_auth.controller;

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

//    @PostMapping("/login")
//    public String login(HttpServletResponse httpServletResponse, String username, String password, String redirect, Model model) {
//        Optional<User> possibleUser = loginService.validateLogin(username, password);
//        if(!possibleUser.isPresent()) {
//            model.addAttribute("error", "Invalid username or password!");
//            return "login";
//        }
//        String token = JwtUtil.generateToken(signingKey, username);
//        CookieUtil.create(httpServletResponse, jwtTokenCookieName, token, false, -1, "localhost");
//
//        return "redirect:" + redirect;
//    }

}
