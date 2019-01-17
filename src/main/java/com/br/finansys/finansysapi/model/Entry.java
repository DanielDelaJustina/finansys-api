package com.br.finansys.finansysapi.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    private String description;
    @NotNull
    private String type;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private LocalDate date;
    @NotNull
    private boolean paid;

    @ManyToOne
    Category category;

}
