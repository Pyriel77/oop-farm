package com.codecool.farm.animal;

public class Pig extends Animal {

    private int size;

    @Override
    public void feed() {
        setSize(1);
    }
}

/*Helye: com.codecool.farm.animal package
        Amikor megetetik mérete 1-el növekszik.*/