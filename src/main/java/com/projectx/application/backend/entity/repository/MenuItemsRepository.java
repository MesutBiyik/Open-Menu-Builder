package com.projectx.application.backend.entity.repository;

import com.projectx.application.backend.entity.model.MenuItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@EnableJpaRepositories
@Repository
@Service
public interface MenuItemsRepository extends JpaRepository<MenuItems, Long> {

}
