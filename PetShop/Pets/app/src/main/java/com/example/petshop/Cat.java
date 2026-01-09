package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable{

//    Constuctor with name only

    public Cat(String name){
        super(name);
    }

    public  Cat(String name, Date birthDate){
        super(name,birthDate);
    }

    @Override
    public String speak(){

        return "Meow";
    }

    @Override
    public void pet(){
        System.out.println("Cat is happy");

    }
}
