package com.luiz.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
