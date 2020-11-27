package com.practice.implementation;

import com.practice.dto.ProjectDTO;
import com.practice.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends AbstractMapService<ProjectDTO,String > implements ProjectService {
    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
    }

    @Override
    public void delete(ProjectDTO object) {

        super.delete(object);
    }

    @Override
    public ProjectDTO findById(String id) {
        return null;
    }

    @Override
    public void save(ProjectDTO object) {

        super.save(object.getProjectCode(),object);
    }

    @Override
    public void update(ProjectDTO object) {

        super.update(object.getProjectCode(),object);
    }
}
