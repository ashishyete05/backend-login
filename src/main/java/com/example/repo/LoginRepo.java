package com.example.repo;

import com.example.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login,Integer> {

    public Login findByUsername(String username);
}
