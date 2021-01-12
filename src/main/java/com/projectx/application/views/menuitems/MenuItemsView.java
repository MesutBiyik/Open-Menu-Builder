package com.projectx.application.views.menuitems;

import com.projectx.application.backend.entity.model.MenuItems;
import com.projectx.application.backend.entity.repository.MenuItemsRepository;
import com.projectx.application.backend.entity.resource.MenuItemsResource;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.gridpro.GridPro;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.projectx.application.views.main.MainView;
import org.springframework.beans.factory.annotation.Autowired;

import java.beans.XMLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;




@Route(value = "items", layout = MainView.class)
@PageTitle("Menu Items")
@CssImport("./styles/views/menuitems/menu-items-view.css")

public class MenuItemsView extends HorizontalLayout {
    //Configure page variables
    @Autowired
    private MenuItemsResource mResource;

    private Grid<MenuItems> grid = new Grid<>(MenuItems.class);

    public MenuItemsView() {
        setId("menu-items-view");
        setSizeFull();
        configureGrid();

        add(grid);
        //updateList();

    }

    private void updateList() {

     List<MenuItems> data1 = mResource.getAll();

     grid.setItems(data1);
    }

    public void configureGrid(){
        grid.setSizeFull();
        grid.setColumns("item_name","item_price","item_section","item_printer","item_category");

  }

}
