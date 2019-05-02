package com.salihyusufcankurt.issuemanagement.service;

import com.salihyusufcankurt.issuemanagement.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueHistoryService {
    IssueHistory save(IssueHistory issueHistory);
    IssueHistory getById(Long id);
    Page <IssueHistory> getAllPageable(Pageable pageable);
    Boolean delete (IssueHistory issueHistory);

    // Buraya sadece metod imzalarını gövdesiz şekilde yazıyoruz.
}
