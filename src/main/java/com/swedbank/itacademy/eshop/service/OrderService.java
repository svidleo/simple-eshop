package com.swedbank.itacademy.eshop.service;

import com.swedbank.itacademy.eshop.bean.entity.Customer;
import com.swedbank.itacademy.eshop.bean.entity.Order;
import com.swedbank.itacademy.eshop.bean.entity.Product;
import com.swedbank.itacademy.eshop.bean.request.OrderRequest;
import com.swedbank.itacademy.eshop.repository.CustomersRepository;
import com.swedbank.itacademy.eshop.repository.OrdersRepository;
import com.swedbank.itacademy.eshop.repository.ProductsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class OrderService {

    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private ProductsRespository productsRespository;
    @Autowired
    private CustomersRepository customersRepository;

    public void createOrder(OrderRequest orderRequest) {
        Set<Product> products =
                StreamSupport.stream(productsRespository.findAll(orderRequest.getProducts()).spliterator(), false)
                .collect(Collectors.toSet());
        Customer customer = customersRepository.findOne(orderRequest.getCustomerId());

        Order newOrder = new Order(
                orderRequest.getDate(),
                customer,
                products
        );

        ordersRepository.save(newOrder);
    }
}
