// Modelo de entidades

package com.campusdual.appmazing.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

// Entidad Product relacionada con la tabla Products de la base de datos.

@Entity

@Table (name = "PRODUCTS")

public class Product {

    // Atributos de clase y tabla.

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

    // Getters y setters.

    public int getId() { return this.id; }
    public String getName() { return this.name; }
    public boolean isActive() { return this.active; }
    public BigDecimal getPrice() { return this.price; }
    public int getStock() { return this.stock; }
    public Date getDate_added() { return this.date_added; }
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setStock(int stock) { this.stock = stock; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public void setActive(boolean active) { this.active = active; }
    public void setDate_added(Date date_added) { this.date_added = date_added; }

}