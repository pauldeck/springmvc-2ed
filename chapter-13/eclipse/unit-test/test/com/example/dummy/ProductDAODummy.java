package com.example.dummy;

import java.math.BigDecimal;

import com.example.dao.ProductDAO;

public class ProductDAODummy implements ProductDAO {
    public BigDecimal calculateDiscount() {
        return null;
    }
    public boolean isOnSale(int productId) {
        return false;
    };
}
