package com.br.finansys.finansysapi.resource;

import com.br.finansys.finansysapi.model.Category;
import com.br.finansys.finansysapi.model.Entry;
import com.br.finansys.finansysapi.repository.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping
    public Category add(@RequestBody @Valid Category category){

        return categories.save(category);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Long id){

        categories.deleteById(id);
    }
}
