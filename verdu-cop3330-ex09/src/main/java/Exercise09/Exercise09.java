package Exercise09;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise09 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the length of the ceiling? ");
        String length = scanner.nextLine();

        System.out.print("What is the width of the ceiling? ");
        String width = scanner.nextLine();

        int len = Integer.parseInt(length);
        int wid = Integer.parseInt(width);

        double SquareFeet = len*wid;
        double Gallons;

        if (SquareFeet <= 350) {
           Gallons = 1;
           }

        else {
           Gallons = Math.ceil(SquareFeet/350);
           }

        System.out.print("You will need to purchase " + String.format("%.0f",Gallons) + " gallons of paint to cover " + String.format("%1.0f", SquareFeet) + " square feet.");

    }

}
