package com.br.finansys.finansysapi.resource;

import com.br.finansys.finansysapi.model.Entry;
import com.br.finansys.finansysapi.repository.Entries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/entries")
public class EntriesResource {

    @Autowired
    private Entries entries;

    @GetMapping
    public List<Entry> listAll() {
        return entries.findAll();
    }
}
