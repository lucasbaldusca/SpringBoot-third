package com.example.projetojpa3tent;

import com.example.projetojpa3tent.domain.Categories;
import com.example.projetojpa3tent.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Projetojpa3tentApplication implements CommandLineRunner {

	@Autowired
	private CategoriesRepository categoriesRepository;
	public static void main(String[] args) {
		SpringApplication.run(Projetojpa3tentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categories cat1 = new Categories(null,"Informatica");
		Categories cat2 = new Categories(null,"Escritorio");

		categoriesRepository.saveAll(Arrays.asList(cat1,cat2));

	}
}
