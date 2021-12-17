package com.example.projetojpa3tent;

import com.example.projetojpa3tent.domain.Category;
import com.example.projetojpa3tent.domain.Product;
import com.example.projetojpa3tent.repositories.CategoriesRepository;
import com.example.projetojpa3tent.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class Projetojpa3tentApplication implements CommandLineRunner {

	@Autowired
	private CategoriesRepository categoriesRepository;

	@Autowired
	private ProductsRepository productsRepository;

	public static void main(String[] args) {
		SpringApplication.run(Projetojpa3tentApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		Product prd1 = new Product(null,"Computador",2000.00);
		Product prd2 = new Product(null,"Impressora", 800.00);
		Product prd3 = new Product(null,"Mouse", 80.00);

		Category cat1 = new Category(null,"Informatica");
		Category cat2 = new Category(null,"Escritorio");

		cat1.getProducts().addAll(Arrays.asList(prd1,prd2,prd3));
		cat2.getProducts().addAll(Collections.singletonList(prd2));

		prd1.getCategories().addAll(Collections.singletonList(cat1));
		prd2.getCategories().addAll(Arrays.asList(cat1,cat2));
		prd3.getCategories().addAll(Collections.singletonList(cat1));




		categoriesRepository.saveAll(Arrays.asList(cat1,cat2));
		productsRepository.saveAll(Arrays.asList(prd1,prd2,prd3));

	}
}
