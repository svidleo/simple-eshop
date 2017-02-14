package com.swedbank.itacademy.eshop.repository;

import com.swedbank.itacademy.eshop.bean.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRespository extends CrudRepository<Product, Long> {


    public Iterable<Product> findByCategoryId(Long id);
}
