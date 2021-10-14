package bfs.TeamProj_auth.controller;

import bfs.TeamProj_auth.service.RegisterService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("login")
@Data
@CrossOrigin(origins = "http://localhost:4200")

public class RegisterController {
    @Autowired
    RegisterService registerService;

    @PostMapping("/register")
    public String register(HttpServletRequest httpServletRequest){
        return registerService.register(httpServletRequest);
    }
}
