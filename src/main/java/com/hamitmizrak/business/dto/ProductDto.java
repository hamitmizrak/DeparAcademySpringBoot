package com.hamitmizrak.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
//@NoArgsConstructor
@Builder
public class ProductDto implements Serializable {

    public static final Long serialVersionUID=1L;

    private Long id;
    private String productName;
    private String productTrade;
    private int productPrice;
    private Date createdDate;

    public ProductDto() {
     this.createdDate=new Date(System.currentTimeMillis());
    }
}
