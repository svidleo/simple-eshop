package com.swedbank.itacademy.eshop.repository;

import com.swedbank.itacademy.eshop.bean.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends CrudRepository<Category, Long> {
}
