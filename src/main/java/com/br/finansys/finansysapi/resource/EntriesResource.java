package com.br.finansys.finansysapi.resource;

import com.br.finansys.finansysapi.model.Entry;
import com.br.finansys.finansysapi.repository.Entries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/entries")
public class EntriesResource {

    @Autowired
    private Entries entries;

    @GetMapping
    public Iterable<Entry> listAll() {

        return entries.findAllByOrderById();
    }

    @PostMapping
    public Entry add(@RequestBody @Valid Entry entry){

        return entries.save(entry);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Long id){

        entries.deleteById(id);
    }
}
