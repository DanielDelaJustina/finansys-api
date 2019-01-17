package com.br.finansys.finansysapi.repository;

import com.br.finansys.finansysapi.model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Entries extends JpaRepository<Entry,Long> {

}
