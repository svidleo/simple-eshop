package com.swedbank.itacademy.eshop.service;

import com.swedbank.itacademy.eshop.bean.entity.Category;
import com.swedbank.itacademy.eshop.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    public void createCategory(String name){
        Category category = new Category();

        category.setName(name);
        categoriesRepository.save(category);
    }
}
