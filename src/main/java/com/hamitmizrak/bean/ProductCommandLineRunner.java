package com.hamitmizrak.bean;

import com.hamitmizrak.data.entity.ProductEntity;
import com.hamitmizrak.data.repository.IProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// LOMBOK
@RequiredArgsConstructor
@Log4j2

@Configuration
public class ProductCommandLineRunner {

    // INJCTION
    // 1.YOL
    /*@Autowired
    private IProductRepository iProductRepository;*/


    // 2.YOL
    /*private IProductRepository iProductRepository;
    @Autowired
    public ProductCommandLineRunner(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }*/

    // 3.YOL
    private final IProductRepository iProductRepository;
    private final PasswordEncoderBean passwordEncoderBean;
    private final ModelMapperBean modelMapperBean;

    @Bean
    public CommandLineRunner commandLineRunnerAutomaticProduct(){
        return (args)->{
            for (int i = 1; i <=10 ; i++) {
                ProductEntity productEntity= ProductEntity.builder()
                        .productName("ürün adı")
                        .productTrade("ürün marka")
                        .productPrice(i*10)
                        .build();
                iProductRepository.save(productEntity);
            } //end for
        }; //end return
    }// end commandLineRunnerAutomaticProduct
}
