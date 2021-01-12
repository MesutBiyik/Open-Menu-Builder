package com.projectx.application.backend.entity.resource;

import com.projectx.application.backend.entity.model.BusinessInfo;
import com.projectx.application.backend.entity.model.UsersAndRoles;
import com.projectx.application.backend.entity.repository.UserAndRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAndRolesResource {

    @Autowired
    UserAndRolesRepository userAndRolesRepository;
    @GetMapping(value = "/all/usersandroles")
    public List<UsersAndRoles> getAll(){

        return userAndRolesRepository.findAll();
    }

    @PostMapping(value = "/all/userssave")
    public List<UsersAndRoles> persist(@RequestBody final UsersAndRoles usersAndRoles){

        userAndRolesRepository.save(usersAndRoles);

        return null;

    }



}


