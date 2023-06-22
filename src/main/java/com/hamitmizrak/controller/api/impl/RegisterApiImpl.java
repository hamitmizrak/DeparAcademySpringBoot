package com.hamitmizrak.controller.api.impl;

import com.hamitmizrak.business.dto.RegisterDto;
import com.hamitmizrak.business.services.IRegisterServices;
import com.hamitmizrak.controller.api.IRegisterApi;
import com.hamitmizrak.util.FrontUrl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//LOMBOK
@RequiredArgsConstructor
@Log4j2

@RestController
@RequestMapping("/register/api/v1/")
@CrossOrigin(FrontUrl.URL)
public class RegisterApiImpl implements IRegisterApi {

    // Injection
    private final IRegisterServices iRegisterServices;

    // http://localhost:4444/register/api/v1/create
    // CREATE
    @Override
    @PostMapping("create")
    public ResponseEntity<?> registerCreate(@Valid @RequestBody RegisterDto registerDto) {
        return ResponseEntity.ok(iRegisterServices.registerCreate(registerDto));
    }

    //http://localhost:4444/register/api/v1/list
    // LIST
    @Override
    @GetMapping("list")
    public ResponseEntity<List<RegisterDto>> registerAllList() {
        return ResponseEntity.ok(iRegisterServices.registerAllList());
    }
}
