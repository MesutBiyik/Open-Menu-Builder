package com.projectx.application.backend.entity.resource;

import com.projectx.application.backend.entity.model.BusinessInfo;
import com.projectx.application.backend.entity.repository.BusinessinfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BusinessInfoResource {

    @Autowired
    BusinessinfoRepository businessinfoRepository;
    @GetMapping(value = "/all/businessInfo")
    public List<BusinessInfo> getAll(){

        return businessinfoRepository.findAll();
    }

    @PostMapping(value = "/all/load")
    public List<BusinessInfo> persist(@RequestBody final BusinessInfo business){

        businessinfoRepository.save(business);

        return null;

    }

    public List<BusinessInfo> update(@RequestBody final BusinessInfo business){

        business.setAbn(business.getAbn());
        business.setVenue_number(business.getVenue_number());
        business.setEmail_address(business.getEmail_address());
        business.setBusiness_name(business.getBusiness_name());
        return null;
    }



}
