package com.salihyusufcankurt.issuemanagement.service;

import com.salihyusufcankurt.issuemanagement.entity.Project;
import com.salihyusufcankurt.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {
    Project save(Project project);
    Project getById(Long id);
    Page <Project> getAllPageable(Pageable pageable);
    Boolean delete (Project project);
    List<Project> getByProjectCode (String projectCode);
    List<Project> getByProjectCodeContains (String projectCode);

    // Buraya sadece metod imzalarını gövdesiz şekilde yazıyoruz.
}
