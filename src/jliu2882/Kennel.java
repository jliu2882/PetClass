package jliu2882;

import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList;

    public Kennel(ArrayList<Pet> p){
        this.petList = p;
    }
    public void allSpeak(){
        for(Pet p: petList){
            System.out.println(p.getName() + ": " + p.speak());
        }
    }
}
