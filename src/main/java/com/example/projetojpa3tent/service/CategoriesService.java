package com.example.projetojpa3tent.service;

import com.example.projetojpa3tent.domain.Categories;
import com.example.projetojpa3tent.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriesService {

    @Autowired
    CategoriesRepository categoriesRepository;

    public Categories buscar (Integer id){
        Optional<Categories> obj = categoriesRepository.findById(id);

        return obj.orElse(null);


    }
}
