package com.juliomchado.api.repositories;

import com.juliomchado.api.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
