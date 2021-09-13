/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Schander
 */
package org.example;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner uInput = new Scanner(System.in);
        System.out.println( "How many people?" );
        int People = uInput.nextInt();
        System.out.println("How many pizzas do you have?");
        int Pizzas = uInput.nextInt();
        System.out.println("How many slices per pizza?");
        int Slices = uInput.nextInt();

        System.out.println(People +" people with "+ Pizzas +" pizzas ("+(Slices*Pizzas)+" slices)\nEach person gets "+((Slices*Pizzas)/People)+" slices.\nThere are "+((Slices*Pizzas)%People)+" slices left");
    }
}
