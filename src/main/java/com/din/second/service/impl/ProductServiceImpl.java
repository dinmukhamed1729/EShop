package com.din.second.service.impl;

import com.din.second.Model.entyties.Product;
import com.din.second.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductService productService;
    @Override
    public List<Product> findAll() {
        return productService.findAll();
    }
}
