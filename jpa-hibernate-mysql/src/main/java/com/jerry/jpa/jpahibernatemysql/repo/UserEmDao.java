package com.jerry.jpa.jpahibernatemysql.repo;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.jerry.jpa.jpahibernatemysql.model.User;


import org.springframework.stereotype.Component;

/**
 * UserEmDao
 */
@Component
public class UserEmDao {

    @PersistenceContext
    private EntityManager em;

    public Optional<User> getById(Integer id) {
        User user = em.find(User.class, id);
        return Optional.ofNullable(user);
    }

    public Optional<User> getByName(String name) {
        
        User user = (User)em.createQuery("SELECT u FROM User u WHERE u.name = :name")
                              .setParameter("name", name)
                              .getSingleResult(); 
        return Optional.ofNullable(user);
    }

    public Integer persist(User user) {
        em.persist(user);
        return user.getId();
    }
    
}