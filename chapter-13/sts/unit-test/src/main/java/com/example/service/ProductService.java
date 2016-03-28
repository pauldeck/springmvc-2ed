package com.example.service;

import java.math.BigDecimal;

public interface ProductService {
    BigDecimal calculateDiscount();
    boolean isOnSale(int productId);

}
