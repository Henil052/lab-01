package com.example.petshop;

import java.util.Date;

public abstract class Pet {

    private String name;
    private Date birthDate;

    // This is the name constructor
    public Pet(String name){

        this.name=name;
        // This will give the current date
        this.birthDate=new Date();
    }

    // Name and Constructors both as arguments

    public Pet(String name,Date birthDate){

        this.name=name;
        this.birthDate=birthDate;
    }

    // Abstract Method
    public abstract String speak();

    // Getters and Setters are generated


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
