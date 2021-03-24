package com.codecool.farm;

import com.codecool.farm.animal.Animal;
import com.codecool.farm.animal.Cattle;

import java.util.ArrayList;
import java.util.List;

class Farm {

    private List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public void feedAnimals() {
        if (!animals.isEmpty()) {
            for (Animal animal : animals) {
                animal.feed();
            }
        }
    }

    public void butcher(Butcher butcher) {
        animals.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        return animals.size() == 0;
    }

    public List<String> getStatus() {
        List<String> status = new ArrayList<>();
        String race = "";
        for (Animal animal : animals) {
            if (animal instanceof Cattle) {
                race = "cattle";
            } else {
                race = "pig";
            }
            status.add("There is a " + animal.getSize() + " sized "
                    + race + " in the farm.");
        }
        return status;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
