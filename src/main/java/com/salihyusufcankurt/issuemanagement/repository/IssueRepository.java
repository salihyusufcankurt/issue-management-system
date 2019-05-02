package com.salihyusufcankurt.issuemanagement.repository;

import com.salihyusufcankurt.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository <Issue, Long> {
}
