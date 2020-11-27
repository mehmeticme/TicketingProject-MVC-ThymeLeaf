package com.practice.bootstrap;

import com.practice.dto.ProjectDTO;
import com.practice.dto.RoleDTO;
import com.practice.dto.UserDTO;
import com.practice.enums.Gender;
import com.practice.enums.Status;
import com.practice.service.ProjectService;
import com.practice.service.RoleService;
import com.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    RoleService roleService;
    UserService userService;
    ProjectService projectService;

    @Autowired
    public DataGenerator(RoleService roleService, UserService userService, ProjectService projectService) {
        this.roleService = roleService;
        this.userService = userService;
        this.projectService = projectService;
    }


    @Override
    public void run(String... args) throws Exception {
        RoleDTO adminRole = new RoleDTO(1L,"Admin");
        RoleDTO employeeRole = new RoleDTO(2L,"Employee");
        RoleDTO managerRole = new RoleDTO(3L,"Manager");

        roleService.save(adminRole);
        roleService.save(employeeRole);
        roleService.save(managerRole);


        UserDTO user1 = new UserDTO("John", "Kesy",
                "admin@practice.com", "abc", true, "7459684532", adminRole, Gender.MALE);
        UserDTO user2 = new UserDTO("Delisa",
                "Norre", "T001@practice.com", "123", true, "8567412358", managerRole, Gender.FEMALE);
        UserDTO user3 = new UserDTO("Craig", "Jark",
                "P001@practice.com", "123", true, "7777775566", employeeRole, Gender.MALE);
        UserDTO user4 = new UserDTO("Shaun",
                "Hayns", "S001@practice.com", "123", true, "3256987412", employeeRole, Gender.MALE);
        UserDTO user5 = new UserDTO("John", "John",
                "admin2@practice.com", "abc", true, "7459684532", managerRole, Gender.MALE);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);


        ProjectDTO project1 = new ProjectDTO("Spring MVC","PR001",user5,"Creating Controllers", LocalDate.now(),LocalDate.now().plusMonths(3), Status.OPEN);
        ProjectDTO project2 = new ProjectDTO("Spring ORM","PR002",user2,"Creating Database", LocalDate.now(),LocalDate.now().plusMonths(1), Status.IN_PROGRESS);

        projectService.save(project1);
        projectService.save(project2);


    }
}
