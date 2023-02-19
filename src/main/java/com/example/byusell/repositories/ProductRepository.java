package com.example.byusell.repositories;

import com.example.byusell.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByTitle(String title);
}
