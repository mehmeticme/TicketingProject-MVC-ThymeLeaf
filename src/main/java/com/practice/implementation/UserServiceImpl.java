package com.practice.implementation;

import com.practice.dto.UserDTO;
import com.practice.service.UserService;

import java.util.List;

public class UserServiceImpl extends AbstractMapService<UserDTO,String > implements UserService {

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(UserDTO object) {
        super.delete(object);
    }

    @Override
    public UserDTO findById(String id) {
        return super.findBy(id);
    }

    @Override
    public void save(UserDTO object) {

        super.save(object.getUsername(),object);
    }

    @Override
    public void deleteById(String id) {

        super.deleteById(id);
    }
}
