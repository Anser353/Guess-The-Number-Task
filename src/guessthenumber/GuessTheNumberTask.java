package guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberTask {

	public static void main(String[] args) 
	{
		Scanner ob = new Scanner(System.in);
        Random r= new Random();
 
        int lower=1;
        int higher=100;
        int guessedno=r.nextInt(99);
        int nooftry=0;
        boolean GuessedCorrectly=false;
        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println("               Welcome to Guess the Number game!");
        System.out.println("        I have generated a number between " + lower + " and " + higher);
        System.out.println("---------------------------------------------------------------");
        System.out.println();
        System.out.println("you can guess it within 10 attempts...");
 
        while (nooftry <10 && !GuessedCorrectly) 
        {
        	System.out.println();
            System.out.print("Enter your guess (attempt " + (nooftry + 1) + "): ");
            int input;
            input=ob.nextInt();
             nooftry++;
 
            if (input<guessedno) 
            {
                System.out.println("Toooo low... Try again...");
            } 
            else if (input>guessedno) 
            {
                System.out.println("Toooo high... Try again...");
            } 
            else 
            {
                GuessedCorrectly = true;
            }
        }
 
        if (GuessedCorrectly) 
        {
        	System.out.println();
        	System.out.println("--------------------------------------------------------------------------");
            System.out.println("You guessed the no " + guessedno + " correct in " + nooftry + " attempt.");
        	System.out.println("--------------------------------------------------------------------------");

        } 
        else 
        {
        	System.out.println();
        	System.out.println("---------------------------------------------------------------");
            System.out.println("you didn't guess the number & The correct number: " + guessedno);
        	System.out.println("---------------------------------------------------------------");

        }
     
    }	
	}

