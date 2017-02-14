package com.swedbank.itacademy.eshop.controller;

import com.swedbank.itacademy.eshop.bean.entity.Category;
import com.swedbank.itacademy.eshop.bean.entity.Order;
import com.swedbank.itacademy.eshop.bean.entity.Product;
import com.swedbank.itacademy.eshop.bean.request.OrderRequest;
import com.swedbank.itacademy.eshop.repository.CategoriesRepository;
import com.swedbank.itacademy.eshop.repository.OrdersRepository;
import com.swedbank.itacademy.eshop.repository.ProductsRespository;
import com.swedbank.itacademy.eshop.service.CategoryService;
import com.swedbank.itacademy.eshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShopController {

    @Autowired
    private CategoriesRepository categoriesRepository;
    @Autowired
    private ProductsRespository productsRespository;
    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public Iterable<Category> getCategories() {

        return categoriesRepository.findAll();
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public Iterable<Product> getProducts() {
        return productsRespository.findAll();
    }


    @RequestMapping(value = "/create/category", method = RequestMethod.POST)
    public void createCategory(@RequestParam String name) {
        categoryService.createCategory(name);
    }

    @RequestMapping(value = "/create/order", method = RequestMethod.POST)
    public void createOrder(@RequestBody OrderRequest order) {
        orderService.createOrder(order);
    }


    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public Iterable<Product> getCategoryProducts(@PathVariable Long id)
    {
        return productsRespository.findByCategoryId(id);
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public Iterable<Order> getOrders() {
        return ordersRepository.findAll();
    }

    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
    public Order getOrder(@PathVariable Long id) {
        return ordersRepository.findOne(id);
    }
}
