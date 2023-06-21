package com.hamitmizrak.controller.api;

import com.hamitmizrak.business.dto.AdminDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//LOMBOK
@Log4j2

@CrossOrigin
@RequestMapping("/admin/api/v1")
@RestController // dış dünyaya açılan kapı
public class AdminApi {

    // http://localhost:2222/admin/api/v1/rest/data
    @GetMapping(value = "/rest/data" )
    public AdminDto adminDto(){
        AdminDto adminDto= AdminDto.builder()
                .adminId(1L)
                .adminName("admin name")
                .adminSurname("admin surname")
                .build();
        return adminDto;
    }
}
