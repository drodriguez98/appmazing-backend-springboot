package com.campusdual.appmazing.model;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORYS")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;

    public int getId() { return this.id; }
    public String getName() { return this.name; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }

}