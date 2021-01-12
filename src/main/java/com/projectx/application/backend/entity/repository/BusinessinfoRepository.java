package com.projectx.application.backend.entity.repository;

import com.projectx.application.backend.entity.model.BusinessInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@EnableJpaRepositories
@Repository
@Service
public interface BusinessinfoRepository extends JpaRepository<BusinessInfo, Long > {

}
