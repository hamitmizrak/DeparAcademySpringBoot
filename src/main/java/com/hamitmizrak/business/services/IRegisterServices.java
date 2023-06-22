package com.hamitmizrak.business.services;

import com.hamitmizrak.business.dto.RegisterDto;
import com.hamitmizrak.data.entity.RegisterEntity;

import java.util.List;

public interface IRegisterServices {

    // Model Mapper
    RegisterEntity DtoToEntity(RegisterDto registerDto);
    RegisterDto EntityToDto (RegisterEntity registerEntity);

    // CREATE
    public RegisterDto registerCreate(RegisterDto registerDto);

    // LIST
    public List<RegisterDto> registerAllList();

}
