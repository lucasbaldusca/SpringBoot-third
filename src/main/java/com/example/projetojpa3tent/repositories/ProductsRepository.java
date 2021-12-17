package com.example.projetojpa3tent.repositories;

import com.example.projetojpa3tent.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
