package com.dhanesh.ExpenseTracker.repository;

import com.dhanesh.ExpenseTracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}