package jliu2882;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        Dog dog = new Dog("Dog");
        LoudDog loudDog = new LoudDog("Loud Dog");

        System.out.println(cat.speak());
        System.out.println(dog.speak());
        System.out.println(loudDog.speak());
        ArrayList<Pet> p = new ArrayList<>();
        p.add(cat);
        p.add(dog);
        p.add(loudDog);
        new Kennel(p).allSpeak();
    }
}
