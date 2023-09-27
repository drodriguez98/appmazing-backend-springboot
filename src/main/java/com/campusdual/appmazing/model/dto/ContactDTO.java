package com.campusdual.appmazing.model.dto;

// Igual que la clase Contact pero sin notaciones.

public class ContactDTO {

    private int id;
    private String name;
    private String surname1;
    private String surname2;
    private String phone;
    private String email;

    public int getId() { return this.id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    public String getSurname1() { return this.surname1; }
    public void setSurname1(String surname) { this.surname1 = surname1; }
    public String getSurname2() { return this.surname2; }
    public void setSurname2(String surname) { this.surname2 = surname2; }
    public String getPhone() { return this.phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return this.email; }
    public void setEmail(String email) { this.email = email; }

}