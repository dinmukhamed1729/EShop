package com.din.second.controllers;

import com.din.second.Model.entyties.Product;
import com.din.second.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductsController {
    private final ProductService productService;
    public List<Product> getProducts(){
        return productService.findAll();
    }
}
