package com.jerry.jpa.jpahibernatemysql.service;

import java.util.List;
import java.util.Optional;

import com.jerry.jpa.jpahibernatemysql.model.User;
import com.jerry.jpa.jpahibernatemysql.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UsersService
 */
@RestController
@RequestMapping("/users")
public class UsersService {
    @Autowired
    UserRepository repo;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return repo.findAll();

    }

    @GetMapping("/{name}")
    public User getByName(@PathVariable final String name) {
        Optional<User> user = repo.findByName(name);

        //return user.orElseThrow(()-> new RuntimeException("No user found"));
        return user.orElse(new User());

    }
}