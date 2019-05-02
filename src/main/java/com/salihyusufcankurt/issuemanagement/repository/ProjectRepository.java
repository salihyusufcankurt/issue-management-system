package com.salihyusufcankurt.issuemanagement.repository;

import com.salihyusufcankurt.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {


    List<Project> getByProjectCode (String projectCode);
    List<Project> getByProjectCodeContains (String projectCode);
    List<Project> findAll (Sort sort);
    Page<Project> findAll (Pageable pageable);

}
