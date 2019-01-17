package com.br.finansys.finansysapi.repository;

import com.br.finansys.finansysapi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Categories extends JpaRepository<Category,Long> {
}
