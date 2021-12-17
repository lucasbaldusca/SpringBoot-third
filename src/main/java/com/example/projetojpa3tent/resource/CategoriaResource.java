package com.example.projetojpa3tent.resource;

import com.example.projetojpa3tent.domain.Category;
import com.example.projetojpa3tent.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    CategoriesService categoriesService;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> findById(@PathVariable Integer id){
        Category obj = categoriesService.buscar(id);
        return ResponseEntity.ok().body(obj);
    }

}
