package io.zipcoder.polymorphism;

import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    public static void main(String[] args){
        int numberOfPets = getIntFromUser("Please enter number of pets: ");
        System.out.println("Now please enter the pets name and its type with a space in-between.");
        System.out.println("Available types are: Dog, Cat, Parrot, Ferret.");

        String[] petName = new String[numberOfPets];
        String[] petType = new String[numberOfPets];

        for(int i=0; i<numberOfPets; i++){
            String s = getStringFromUser("Enter a pet name and type: ");
            String[] sArray = s.split(" ");
            petName[i] = sArray[0];
            petType[i] = sArray[1];
        }
        System.out.println("Your pet list:");
        for(int i=0; i<numberOfPets; i++){
            System.out.println(petName[i] + " "+ petType[i]);
        }

    }
    public static int getIntFromUser(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.printf(prompt);
        while(true){
            try {
                return Integer.valueOf(scanner.nextLine());
            } catch (Exception e) {
                System.out.printf("Input invalid, please enter again: ");
            }
        }
    }

    public static String getStringFromUser(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }


}

