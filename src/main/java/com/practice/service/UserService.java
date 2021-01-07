package com.practice.service;

import com.practice.dto.UserDTO;
import com.practice.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService extends CrudService<UserDTO,String> {

    List<UserDTO> findManagers();
    List<UserDTO> findEmployees();
    List<UserDTO> findAdmins();

}
