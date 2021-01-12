package com.projectx.application.backend.entity.resource;

import com.projectx.application.backend.entity.model.MenuItems;
import com.projectx.application.backend.entity.repository.MenuItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuItemsResource {

    @Autowired
    MenuItemsRepository menuItemsRepository;
    @GetMapping(value = "/all/menuitems")
    public List<MenuItems> getAll(){

        return menuItemsRepository.findAll();
    }

    @PostMapping(value = "/all/menuitemssave")
    public List<MenuItems> persistMenuItems(@RequestBody final MenuItems menuItems) {

        menuItemsRepository.save(menuItems);

        return null;
    }




}
