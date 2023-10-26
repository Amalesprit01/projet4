package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setAge(5);
        lion.setFamily("cats");
        System.out.println(lion.getName());
        Animal dog = new Animal("canine", "snoopy", 5, true);
        System.out.println(dog.getName());
        Zoo myZoo = new Zoo("wildlife", "Ariana", 25);
        Zoo urZoo = new Zoo("jungle", "america", 20);

        System.out.println(myZoo);
       /* tn.esprit.gestionzoo.entities.Zoo.displayZoo();


        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        */
        System.out.println(dog);
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));
        System.out.println(myZoo.searchAnimal(dog));

        Animal chat = new Animal("chat", "chat", 6, true);
        System.out.println(myZoo.searchAnimal(dog));
        boolean removed = myZoo.removeAnimal(lion);
        System.out.println(removed);
        System.out.println(Zoo.comparerZoo(myZoo, urZoo));
        System.out.println(myZoo.isZooFull(myZoo));
        // aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);
        //aquatic.swim();
        dolphin.swim();
        penguin.swim();
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(penguin);


        for (Aquatic a : myZoo.getAquaticAnimals()) {
            if (a != null)
                a.swim();
        }

    }
    
}

