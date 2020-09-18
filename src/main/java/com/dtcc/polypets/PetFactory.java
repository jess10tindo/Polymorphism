package com.dtcc.polypets;

import java.util.*;

public class PetFactory {

    public static void userInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numOfPets = input.nextInt();
        input.nextLine();

        Pet[] petArray = new Pet[numOfPets];

        for(int i = 0 ; i < numOfPets; i++){
            System.out.println("What kind of pet is it?");
            String typeOfPet = input.nextLine();
            System.out.println("What is the pet's name?");
            String nameOfPet = input.nextLine();
            if(typeOfPet.equalsIgnoreCase("dog")){
                petArray[i] = new Dog(nameOfPet);
            }
            if(typeOfPet.equalsIgnoreCase("cat")){
                petArray[i] = new Cat(nameOfPet);
            }
            if(typeOfPet.equalsIgnoreCase("cow")){
                petArray[i] = new Cow(nameOfPet);
            }
        }
        for(int i = 0 ; i < numOfPets; i++){
            System.out.println(petArray[i].getName() + " " + petArray[i].getSpeak());
        }
    }
    public static void main(String[] args) {
        userInput();
    }
}
