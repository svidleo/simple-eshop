package com.swedbank.itacademy.eshop.bean.request;

import java.time.LocalDate;
import java.util.List;

public class OrderRequest {

    private LocalDate date;

    private Long customerId;
    private List<Long> products;

    public OrderRequest() {
        date = LocalDate.now();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public List<Long> getProducts() {
        return products;
    }

    public void setProducts(List<Long> products) {
        this.products = products;
    }
}
