package com.codecool.farm;

import com.codecool.farm.animal.Animal;

class Butcher {

    public boolean canButcher(Animal animal) {

        if (animal.getSize() > 4) {
            return true;
        }
        return false;
    }

}

/*Helye: com.codecool.farm package
Tartalmaz egy boolean canButcher(Animal animal) metódust ami visszaadja, hogy a
paraméterben megadott állat levágható-e. Egy állatot akkor lehet levágni ha mérete nagyobb 4 egységnél.*/

