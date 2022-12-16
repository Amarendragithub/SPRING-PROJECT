package com.springmca.demo.domain;

import javax.persistence.*;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String notes;

    @OneToOne
    private  Recipe recipe;

    public static class Ingredient {

    }
}


