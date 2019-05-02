package com.salihyusufcankurt.issuemanagement.service;

import com.salihyusufcankurt.issuemanagement.entity.Issue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    Issue save(Issue issue);
    Issue getById(Long id);
    Page <Issue> getAllPageable (Pageable pageable);
    Boolean delete (Issue issue);
    // Buraya sadece metod imzalarını gövdesiz şekilde yazıyoruz.
}
