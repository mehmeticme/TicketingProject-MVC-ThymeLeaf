package com.practice.implementation;

import com.practice.dto.UserDTO;
import com.practice.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
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

    @Override
    public void update(UserDTO object) {
        super.update(object.getUsername(),object);
    }

    @Override
    public List<UserDTO> findManagers() {
        return super.findAll().stream().filter( user -> user.getRole().getDescription().toLowerCase().equals("manager")).collect(Collectors.toList());
    }

    @Override
    public List<UserDTO> findEmployees() {
        return super.findAll().stream().filter( user -> user.getRole().getDescription().toLowerCase().equals("employee")).collect(Collectors.toList());
    }

    @Override
    public List<UserDTO> findAdmins() {
        return super.findAll().stream().filter( user -> user.getRole().getDescription().toLowerCase().equals("admin")).collect(Collectors.toList());
    }
}
