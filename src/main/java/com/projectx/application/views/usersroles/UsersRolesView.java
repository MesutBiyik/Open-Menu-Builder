package com.projectx.application.views.usersroles;

import com.projectx.application.backend.entity.model.UsersAndRoles;
import com.projectx.application.views.main.MainView;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.server.VaadinSession;

import java.util.List;


@Route(value = "usersandroles", layout = MainView.class)
@PageTitle("Users & Roles")
@CssImport("./styles/views/usersroles/users-roles-view.css")



public class UsersRolesView extends HorizontalLayout {

    private UsersAndRoles UARReource = new UsersAndRoles();
    public UsersRolesView() {
        setId("users-roles-view");
        add(new Label("Content placeholder"));

    }



}
