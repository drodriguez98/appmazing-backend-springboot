// Modelo de entidades

package com.campusdual.appmazing.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity

@Table (name = "PRODUCTS")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int stock;
    @Column
    private BigDecimal price;
    @Column
    private boolean active;
    @Column
    private Date date_added;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category_id;

    public int getId() { return this.id; }
    public String getName() { return this.name; }
    public boolean isActive() { return this.active; }
    public BigDecimal getPrice() { return this.price; }
    public int getStock() { return this.stock; }
    public Date getDate_added() { return this.date_added; }
    public Category getCategory_id() { return category_id; }

    public void setId (int id) { this.id = id; }
    public void setName (String name) { this.name = name; }
    public void setStock (int stock) { this.stock = stock; }
    public void setPrice (BigDecimal price) { this.price = price; }
    public void setActive (boolean active) { this.active = active; }
    public void setDate_added (Date date_added) { this.date_added = date_added; }
    public void setCategory_id (Category category_id) { this.category_id = category_id; }

}