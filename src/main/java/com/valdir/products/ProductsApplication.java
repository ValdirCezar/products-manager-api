package com.valdir.products;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.valdir.products.domain.Product;
import com.valdir.products.repositories.ProductRepository;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner{
	
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Product p1 = new Product(null, "Mouse", 129.90, "Mouse Gamer");
		Product p2 = new Product(null, "Teclado", 129.90, "Teclado Gamer");
		Product p3 = new Product(null, "Headset", 129.90, "Headset Gamer");
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
	}

}
