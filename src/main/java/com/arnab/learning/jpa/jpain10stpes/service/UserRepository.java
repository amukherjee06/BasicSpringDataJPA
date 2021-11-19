package com.arnab.learning.jpa.jpain10stpes.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arnab.learning.jpa.jpain10stpes.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
