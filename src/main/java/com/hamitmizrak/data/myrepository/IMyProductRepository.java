package com.hamitmizrak.data.myrepository;
import com.hamitmizrak.data.entity.ProductEntity;
import java.util.List;

// My Special Repository
public interface IMyProductRepository {
    public List<ProductEntity> findProductPriceMinData(int productPrice);
}
