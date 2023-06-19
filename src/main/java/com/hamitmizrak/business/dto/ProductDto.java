package com.hamitmizrak.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
//@NoArgsConstructor
@Builder
public class ProductDto {

    private Long id;
    private String productName;
    private String productTrade;
    private int productPrice;
    private Date createdDate;

    public ProductDto() {
     this.createdDate=new Date(System.currentTimeMillis());
    }
}
