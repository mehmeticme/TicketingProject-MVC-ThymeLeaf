package com.practice.service;

import com.practice.dto.ProjectDTO;

public interface ProjectService extends CrudService<ProjectDTO,String > {

    void completeProject(ProjectDTO project);
}
