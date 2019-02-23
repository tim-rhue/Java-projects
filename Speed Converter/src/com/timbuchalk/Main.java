package com.timbuchalk;


//Assignment:
//   1) Write a method called 'toMilesPerHour' that has 1 parameter of type Double with the name 'kilometersPerHour'.
//This method needs to return the rounded value of the calculation of type long.
//
//If the parameter 'kilometersPerHour' is less than 0, the method 'toMilesPerHour' needs to return -1 to indicate and invalid value.
//
//Otherwise, if it is positive, calculate the value of the miles per hour, round it and return it.
//For conversion and rounding, check the notes in the text below.

//   2) Write another method called 'printConversion' with 1 parameter of type double with the name 'kilometersPerHour'.
// This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
//
//Then it needs to print a message in the format "XX km/h = YY mi/h".
//
//XX represents the original value kilometersPerHour.
//YY represents the rounded milesPerHour from the kilometersPerHour parameter.
//
//If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".

//use Math.round() which is built into the Udemy.com browser.

//TIP: In the method printConversion, call the method toMilesPerHour instead of duplicating the code.

//NOTE: All methods should be defined as "public static" like we have been doing in the course so far.

//NOTE: 1 mile per hour is: 1.609 kilometers per hour.

//NOTE: Do not add a main method to the solution submitted on the Udemy.com course (already in the backend code).


public class Main {

    public static void main(String[] args) {

        printConversion(99.66666);
        printConversion(7);
        printConversion(139);
        printConversion(-9);
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {

        long conversion = toMilesPerHour(kilometersPerHour);

        if (conversion < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println((kilometersPerHour) + " km/h = " + conversion + " mi/h");
        }
    }
}