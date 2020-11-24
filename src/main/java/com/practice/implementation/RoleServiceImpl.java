package com.practice.implementation;

import com.practice.dto.RoleDTO;
import com.practice.service.RoleService;

import java.util.List;

public class RoleServiceImpl extends AbstractMapService<RoleDTO,Long> implements RoleService {
    @Override
    public List<RoleDTO> findAll() {
       return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }

    @Override
    public void delete(RoleDTO object) {

        super.delete(object);
    }

    @Override
    public RoleDTO findById(Long id) {
        return super.findBy(id);
    }

    @Override
    public void save(RoleDTO object) {
        super.save(object.getId(),object);
    }
}
