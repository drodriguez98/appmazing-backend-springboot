package com.campusdual.appmazing.model.dto;

import java.math.BigDecimal;
import java.util.Date;

// Igual que la clase Product pero sin notaciones.

public class ProductDTO {

    private int id;
    private String name;
    private int stock;
    private BigDecimal price;
    private boolean active;
    private Date date_added;

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