package com.hamitmizrak.controller.mvc;

import com.hamitmizrak.data.myrepository.IMyProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

// LOMBOK
@RequiredArgsConstructor

@Controller
public class ProductController {

    private final IMyProductRepository iMyProductRepository;
}
