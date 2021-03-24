package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {

    private List<Animal> animalList;

    public Farm(List<Animal> animalList) {

    }

    public void feedAnimals() {

    }

    public void butcher(Butcher butcher) {

    }

    public boolean isEmpty() {

        return false;
    }

    public List<String> getStatus() {
        List<String> status = new ArrayList<>();

        return status;
    }

    public List<Animal> getAnimals() {
        List<Animal> allAnimals = new ArrayList<>();

        return allAnimals;
    }

}
/*Helye: com.codecool.farm package
        Egy állatokból álló listában tárolódnak a farmon található állatok.
        Ez a lista a constructorban megadható.

        feedAnimals() method:
        feladata: A farmon lévő összes állat megetetése.
        butcher(Butcher butcher) method:
        feladata: Az összes levágható állat eltávolítása a farmon lévő állatokat tartalmazó listából.
        boolean isEmpty() method:
        feladata: Igazat ad vissza, ha a farmon nincsenek állatok, egyébként hamisat ad.
        List<String> getStatus() mehod:
        feladata: Az állatok státuszait tartalmazó listát ad vissza, a
        farmon lévő összes állatra vonatkozóan.
        A lista elemei a következő formátumot követik:
        "There is a <állat mérete> sized <állat típusa (pig/cattle)> in the farm."*/