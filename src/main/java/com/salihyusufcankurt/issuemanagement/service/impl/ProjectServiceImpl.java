package com.salihyusufcankurt.issuemanagement.service.impl;

import com.salihyusufcankurt.issuemanagement.entity.Project;
import com.salihyusufcankurt.issuemanagement.repository.ProjectRepository;
import com.salihyusufcankurt.issuemanagement.service.ProjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository){

        this.projectRepository = projectRepository;
    }
    @Override
    public Project save(Project project) {
        // Burası business logic in nasıl handle edileceğinin bir örneğidir.
        if(project.getProjectCode() == null){
            throw new IllegalArgumentException("Project code cannot be null");
        }
        project = projectRepository.save(project);
        return project;
    }

    @Override
    public Project getById(Long id) {

        return projectRepository.getOne(id);
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return projectRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(Project project) {
        return null;
    }

    @Override
    public List<Project> getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public List<Project> getByProjectCodeContains(String projectCode) {
        return null;
    }
}
