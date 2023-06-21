package com.hamitmizrak.data.myrepository;

import com.hamitmizrak.data.entity.ProductEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductMyRepositoryImpl implements IMyProductRepository{

    //EntityManager
    @PersistenceContext
    private EntityManager entityManager;

    //Override
    @Override
    public List<ProductEntity> findProductPriceMinData(int productPrice) {
        String jpql="select t from ProductEntity t where t.productPrice>=:key";
        TypedQuery<ProductEntity> typedQuery=entityManager.createQuery(jpql,ProductEntity.class);
        typedQuery.setParameter("key",productPrice);
        return typedQuery.getResultList();
    }
}
