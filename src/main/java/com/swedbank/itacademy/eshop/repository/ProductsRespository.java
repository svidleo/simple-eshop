package com.swedbank.itacademy.eshop.repository;

import com.swedbank.itacademy.eshop.bean.entity.Category;
import com.swedbank.itacademy.eshop.bean.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRespository extends CrudRepository<Product, Long> {


    public Iterable<Product> findByCategoryId(Long id);
}
