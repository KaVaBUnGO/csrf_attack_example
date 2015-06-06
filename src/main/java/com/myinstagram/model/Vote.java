package com.myinstagram.model;

import javax.persistence.*;

@Entity
public class Vote {

    @Id
    @GeneratedValue
    private Long id;


    @Column(nullable = false)
    private String name;

    @Column
    private int value;

    public Vote() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
