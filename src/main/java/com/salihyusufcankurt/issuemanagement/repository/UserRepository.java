package com.salihyusufcankurt.issuemanagement.repository;

import com.salihyusufcankurt.issuemanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername (String userName);
}
