package Laboratorium14;

import java.util.Random;

public class AnimalShelter {
    public static void main(String[] args) {


//        Animal[] animals = {new Dog(), new Dog(), new Dog(), new Dog(), new Cat()};
//
//        System.out.println(animals[0].getInstanceNumber());
//        System.out.println(animals[0].getType());
//
//        System.out.println(animals[0].getInstanceNumber());
//        System.out.println(animals[4].getType());
//    }

        Animal[] animals = new Animal[100];
        Random random = new Random();

        for (int i = 0; i < animals.length; i++) {
            int r = random.nextInt(3); //0, 1, 2
            switch (r) {
                case 0:
                    animals[i] = new Dog();
                    break;
                case 1:
                    animals[i] = new Cat();
                    break;
                case 2:
                    animals[i] = new Hamster();
                    break;
            }
//            animals[i] = new Dog();
        }
        System.out.println(animals[99].getInstanceNumber());
        System.out.println(animals[99].getType());
        System.out.println("------------------------");
        System.out.println(" W kojcu nr 33 znajduje się " + animals[32].getType() + ". Łączna liczba kotów - " + animals[32].getInstanceNumber());
        System.out.println("------------------------");
        for (Animal animal: animals) {
            System.out.println(animal.getType());

        }
    }



}

