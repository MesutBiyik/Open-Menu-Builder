package com.projectx.application.backend.entity.model;

import com.projectx.application.backend.entity.repository.UserAndRolesRepository;
import com.projectx.application.backend.entity.resource.UserAndRolesResource;
import com.vaadin.data.provider.CallbackDataProvider;
import com.vaadin.flow.data.provider.DataProvider;
import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Entity
public class UsersAndRoles {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    int user_id;
    @Column(name = "user_name")
    String user_name;
    @Column(name = "user_role")
    String user_role;


    public UsersAndRoles(){


    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

}


