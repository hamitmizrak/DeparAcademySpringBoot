package com.hamitmizrak.controller.api;

import com.hamitmizrak.business.dto.RegisterDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IRegisterApi {

    // CREATE
    public ResponseEntity<?> registerCreate(RegisterDto registerDto);

    // LIST
    public ResponseEntity<List<RegisterDto>>  registerAllList();
}
