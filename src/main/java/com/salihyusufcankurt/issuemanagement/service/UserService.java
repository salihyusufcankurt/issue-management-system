package com.salihyusufcankurt.issuemanagement.service;

import com.salihyusufcankurt.issuemanagement.entity.Issue;
import com.salihyusufcankurt.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    User save(User user);
    User getById(Long id);
    Page <User> getAllPageable(Pageable pageable);
    Boolean delete (User user);
    User getByUserName (String username);

    // Buraya sadece metod imzalarını gövdesiz şekilde yazıyoruz.
}
