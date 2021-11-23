package com.example.projetojpa3tent.resource;

import com.example.projetojpa3tent.domain.Categories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categories> listar(){

        Categories cat1 = new Categories(1,"Joao");
        Categories cat2 = new Categories(2,"Maria");
        List<Categories> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);

        return catList;
    }

}
