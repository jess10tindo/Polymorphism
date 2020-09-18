package com.dtcc.polypets;

import java.util.*;

public class Pet {

    private String name;
    private String speak;

    public String getName(){return this.name;}
    public String getSpeak(){return this.speak;}
    public void setName(){this.name = name;}
    public void setSpeak(){this.name = speak;}

    public Pet() { }

    public Pet(String name){
        this.name = name;
    }

//    public Pet(String name, String speak){
//        this.name = name;
//        this.speak = speak;
//    }

    public String speak(){
        String speak = "moo";
        return speak;
    }

//    public static void  main(String[] args){
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("How many pets do you have?");
//        int numOfPets = input.nextInt();
//        input.nextLine();
//
//        String[] typesOfPets = new String[numOfPets];
//        String[] namesOfPets = new String[numOfPets];
//
//        for(int i = 0; i < numOfPets; i++) {
//            System.out.println("What type of pet is it?");
//            String typeOfPet = input.nextLine();
//            System.out.println(typeOfPet);
//            typesOfPets[i] = typeOfPet;
//            System.out.println("What is the pet's name?");
//            String nameOfPet = input.nextLine();
//            namesOfPets[i] = nameOfPet;
//        }
//        for(int i=0; i < numOfPets; i++){
//            System.out.println("Pet #" + (i+1) + ": Type: " + typesOfPets[i] + "\tName: " + namesOfPets[i]);
//        }
//    input.close();
//    }

}
