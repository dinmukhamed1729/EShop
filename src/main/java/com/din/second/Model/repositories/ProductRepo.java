package com.din.second.Model.repositories;

import com.din.second.Model.entyties.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
