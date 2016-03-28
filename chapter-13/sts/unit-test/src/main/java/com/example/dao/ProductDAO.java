package com.example.dao;

import java.math.BigDecimal;

public interface ProductDAO {
    BigDecimal calculateDiscount();
    boolean isOnSale(int productId);
}
