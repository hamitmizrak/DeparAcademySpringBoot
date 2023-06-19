package com.hamitmizrak.controller.mvc;

import com.hamitmizrak.business.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Controller
@Controller
public class SpringMvcTutorials {

    // http://localhost:2222/getData0
    @GetMapping("/getData0")
    @ResponseBody
    public String getThymeleaf0(){
        return "Sayfasız Alan";
    }

    // http://localhost:2222/getData1
    @GetMapping("/getData1")
    public String getThymeleaf1(){
        return "thymeleaf1";
    }

    // http://localhost:2222/getData2
    @GetMapping("/getData2")
    public String getThymeleaf2(Model model){
        model.addAttribute("key_2","Backentten geldim");
        return "thymeleaf2";
    }

    // http://localhost:2222/getData3
    @GetMapping("/getData3")
    public String getThymeleaf3(Model model){
        ProductDto productDto= new ProductDto();
        productDto.setId(1L);
        productDto.setProductName("ürün adı");
        productDto.setProductTrade("ürün markası");
        productDto.setProductPrice(100);
        model.addAttribute("key_3",productDto);
        return "thymeleaf3";
    }


    // http://localhost:2222/getData4
    @GetMapping("/getData4")
    public String getThymeleaf4(Model model){
        List<ProductDto> productDtoList=new ArrayList<>();
        for (int i =1 ; i <=10 ; i++) {
            ProductDto productDto= new ProductDto();
            productDto.setId(Long.valueOf(i));
            productDto.setProductName(UUID.randomUUID().toString());
            productDto.setProductTrade("ürün markası"+i);
            productDto.setProductPrice(100*i);
            productDtoList.add(productDto);
        }
        model.addAttribute("key_4",productDtoList);
        return "thymeleaf4";
    }



} //end class SpringMvcTutorials
