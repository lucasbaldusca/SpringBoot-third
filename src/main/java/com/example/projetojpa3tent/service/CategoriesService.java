package com.example.projetojpa3tent.service;

import com.example.projetojpa3tent.domain.Category;
import com.example.projetojpa3tent.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriesService {

    @Autowired
    CategoriesRepository categoriesRepository;

    public Category buscar (Integer id){
        Optional<Category> obj = categoriesRepository.findById(id);

        return obj.orElse(null);


    }
}
