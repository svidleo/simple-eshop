package com.swedbank.itacademy.eshop.repository;

import com.swedbank.itacademy.eshop.bean.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<Order, Long> {
}
