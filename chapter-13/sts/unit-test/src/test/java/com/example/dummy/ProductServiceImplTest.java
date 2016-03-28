package com.example.dummy;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.example.dao.ProductDAO;
import com.example.service.ProductService;
import com.example.service.ProductServiceImpl;

public class ProductServiceImplTest {

    @Test
    public void testCalculateDiscount() {
        ProductDAO productDAO = new ProductDAODummy();
        ProductService productService = new ProductServiceImpl(productDAO);
        assertNotNull(productService);
    }

}
