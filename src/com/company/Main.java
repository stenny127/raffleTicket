package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        mainMenu();

    }

    public static void checkTicket(){
        ArrayList<Integer> raffleNumbers = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("would you like to check a ticket? (yes = 1 no = 0)");
        System.out.println("What is your number?");
        try {
            String numCheck = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i=0; i<raffleNumbers.size())
            break;
    }

    public static void mainMenu() {

        Random rand = new Random();

        ArrayList<String> raffleNames = new ArrayList<>();
        
        try {
            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("would you like to buy a ticket? number divisible by 5 win (yes = 1 no = 0)");
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 0:
                        checkTicket();
                        break;
                    case 1:
                        System.out.println("thanks for falling for my scam, kid|what is your name?");
                        String name = reader.readLine();
                        raffleNames.add(name);
                        int min = 1;
                        int max = 500;
                        int randomRaffle = rand.nextInt((max - min) + 1) + min;
                        System.out.println("Your number is " + randomRaffle);
                        raffleNumbers.add(randomRaffle);
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error in mainMenu method" + e);
        }

    }

}

