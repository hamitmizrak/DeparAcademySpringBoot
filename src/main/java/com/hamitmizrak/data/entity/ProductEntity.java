package com.hamitmizrak.data.entity;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="product")
public class ProductEntity extends BaseEntity implements Serializable {

    public static final Long serialVersionUID=1L;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_trade")
    private String productTrade;

    @Column(name = "product_price")
    private int productPrice;

    //@Lob
    //private String picture;

    //@Transient
    //private int counter;
}
