package com.swedbank.itacademy.eshop.repository;

import com.swedbank.itacademy.eshop.bean.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends CrudRepository<Customer, Long> {
}
