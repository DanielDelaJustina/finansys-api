package com.br.finansys.finansysapi.resource;

import com.br.finansys.finansysapi.model.Category;
import com.br.finansys.finansysapi.repository.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/categories")
public class CategoriesResource {

    @Autowired
    Categories categories;

    @GetMapping
    public List<Category> listAll( ) {
        return categories.findAll();
    }
}
