package com.example.stub;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.example.dao.ProductDAO;
import com.example.service.ProductService;
import com.example.service.ProductServiceImpl;

public class ProductServiceImplTest {

    @Test
    public void testCalculateDiscount() {
        ProductDAO productDAO = new ProductDAOStub();
        ProductService productService = new ProductServiceImpl(productDAO);
        assertNotNull(productService);
    }

}
