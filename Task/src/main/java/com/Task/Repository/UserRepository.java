package com.Task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Task.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

