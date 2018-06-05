package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
       // String resultInput = null;
        boolean quit = false;


        String[] hedges = {

                "Please tell me more", "Many of my patients tell me the same things", "It is getting Late, Maybe we had better quite"};

        String[] qualifier = {
                "Why do you say that", "You seem to think that", "So, you are concerned that "};
        // implement a random number from 0 - (how ever many qualifiers you have-1)
        // view that value qualifier[random number you received] = one of the 3
        String output = "";
        //String[] userInput = new String[3];


        do {
            System.out.println("Good Day, What is your Problem? ");
            String userAdd = input.nextLine();

            // Split the array to change some words
            String[] splitStr = userAdd.split(" ");

            //for loop to go through the array and replace some words
            for (int i = 0; i < splitStr.length; i++) {
                if (splitStr[i].equalsIgnoreCase("me")) {
                    splitStr[i] = "you";
                }

                    if (splitStr[i].equalsIgnoreCase("my")) {
                        splitStr[i] = "your";
                        //for (int put=0,i< args.length;i++){



                    // Eliza responds back
                    // Using a random number index generator for the qualifiers and hedges
                    // Ask if user wants to continue talking, if no, exit loop
                }
            }
                for (int i = 0; i < splitStr.length; i++) {
                    output += splitStr[i] + " ";
                }
                System.out.println(output);

                Random rd = new Random();

                String quitInput = input.next();
                if (quitInput.equalsIgnoreCase("Yes")) {
                    quit = true;
                }
            System.out.print("Do you want to quit? (Yes to Quit)");
                }while (quit == false) ;

            }

        }


