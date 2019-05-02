package com.salihyusufcankurt.issuemanagement.service.impl;

import com.salihyusufcankurt.issuemanagement.entity.Issue;
import com.salihyusufcankurt.issuemanagement.repository.IssueRepository;
import com.salihyusufcankurt.issuemanagement.service.IssueService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;

    public IssueServiceImpl (IssueRepository issueRepository){
    this.issueRepository = issueRepository;
    }

    @Override
    public Issue save(Issue issue) {
        return null;
    }

    @Override
    public Issue getById(Long id) {
        return null;
    }

    @Override
    public Page<Issue> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public Boolean delete(Issue issue) {
        return null;
    }
    // Issueepository yi inject ettik (constructor injection)


}
