package com.salihyusufcankurt.issuemanagement.repository;

import com.salihyusufcankurt.issuemanagement.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

// < Bu interface hangi tabloya hizmet edecek ? , Bu tablonun primary key inin tipi nedir ? >
public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {
}
