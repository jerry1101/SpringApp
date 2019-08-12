package com.jerry.jpa.jpahibernatemysql.repo;

import java.util.Optional;

import com.jerry.jpa.jpahibernatemysql.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */
/**
 * IUserRepository extends JpaRepository<>
 */
public interface UserRepository extends JpaRepository< User,Integer> {

	Optional<User> findByName(String name);

    
}