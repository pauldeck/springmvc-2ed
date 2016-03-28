package com.example.stub;

import java.math.BigDecimal;

import com.example.dao.ProductDAO;

public class ProductDAOStub implements ProductDAO {
    public BigDecimal calculateDiscount() {
        return new BigDecimal(14);
    }
    public boolean isOnSale(int productId) {
        return false;
    };
}
