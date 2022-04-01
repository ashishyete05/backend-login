package com.example.rest;

import com.example.model.Login;
import com.example.repo.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginRepo repo;

    @GetMapping("/greetings")
    public String greeting(){
        return "hello!";
    }

    @GetMapping("/login")
    public boolean loginSuccess(@RequestBody Login login){

        Login loginDB = repo.findByUsername(login.getUsername());
        return loginDB != null && (loginDB.getPassword().equals(login.getPassword()));
    }


}
