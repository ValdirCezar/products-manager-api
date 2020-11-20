package com.valdir.products.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.products.domain.Product;
import com.valdir.products.repositories.ProductRepository;
import com.valdir.products.services.exceptions.ObjectNotFoundException;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public Product findById(Integer id) {
		Optional<Product> obj = repository.findById(id);
		return obj.orElseThrow(
				() -> new ObjectNotFoundException("Object not found! Id:" + id + ", Type: " + Product.class.getName()));
	}

	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product insert(Product obj) {
		obj.setId(null);
		return repository.save(obj);
	}
	
	public Product update(Product obj) {
		findById(obj.getId());
		Product newObj = new Product(obj.getId(), obj.getName(), obj.getPrice(), obj.getDescription());
		return repository.save(newObj);
	}
	
	public void deleteById(Integer id) {
		findById(id);
		try {
			repository.deleteById(id);
		} catch (Exception e) {
			throw new NotYetImplementedException("Méthod not yet implemented");
		}
	}

}
