package com.valdir.products.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valdir.products.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
