package com.hamitmizrak.business.services.impl;

import com.hamitmizrak.bean.ModelMapperBean;
import com.hamitmizrak.bean.PasswordEncoderBean;
import com.hamitmizrak.business.dto.RegisterDto;
import com.hamitmizrak.business.services.IRegisterServices;
import com.hamitmizrak.data.entity.RegisterEntity;
import com.hamitmizrak.data.repository.IRegisterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

// Lombok
@RequiredArgsConstructor
@Log4j2

// SERVISE
@Service
public class RegisterServicesImpl implements IRegisterServices {

    // Injection
    private final ModelMapperBean modelMapperBean;
    private final PasswordEncoderBean passwordEncoderBean;
    private final IRegisterRepository iRegisterRepository;

    // Model Mapper
    @Override
    public RegisterEntity DtoToEntity(RegisterDto registerDto){
        return  modelMapperBean.modelMapperMethod().map(registerDto,RegisterEntity.class);
    }

    @Override
    public RegisterDto EntityToDto(RegisterEntity registerEntity) {
        return modelMapperBean.modelMapperMethod().map(registerEntity,RegisterDto.class);
    }

    // CREATE
    @Override
    @Transactional // Create, Delete, Update
    public RegisterDto registerCreate(RegisterDto registerDto) {

        //Masking
        passwordEncoderBean.passwordEncoderMethod().encode(registerDto.getUPassword());
        RegisterDto registerDtoModel=null;
        if(registerDto!=null){
         RegisterEntity registerEntity= iRegisterRepository.save(DtoToEntity(registerDto));
            //registerDto.setId(registerEntity.getId());
             registerDtoModel=EntityToDto(registerEntity);
        }
        return registerDtoModel;
    }

    // LIST
    @Override
    public List<RegisterDto> registerAllList() {
      List<RegisterEntity> registerEntityList=  iRegisterRepository.findAll();
      List<RegisterDto> registerDtoList=new ArrayList<>();
      RegisterDto registerDto=null;
      // ForEach
      for(RegisterEntity entity : registerEntityList){
          registerDto=EntityToDto(entity);
          registerDtoList.add(registerDto);
      }
        //registerDtoList.stream().forEach(System.out::println);
        //registerDtoList.forEach(System.out::println);
        registerDtoList.forEach((temp)->{
            System.out.println(temp);
        });
        return registerDtoList;
    }
}
