package com.josueao.labcommercebase.repositories;

import com.josueao.labcommercebase.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
