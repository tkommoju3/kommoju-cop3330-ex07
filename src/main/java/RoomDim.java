/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;
public class RoomDim {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        double sMeters = 0;
        int sFeet = 0;

        System.out.print("What is the length of the room in feet? ");
        a = input.nextInt();
        System.out.print("What is the width of the room in feet? ");
        b = input.nextInt();
        System.out.println("You entered dimensions of "+a+" feet by "+b+" feet.");
        System.out.println("The area is");
        sFeet = a*b;
        sMeters = (a*b)*0.09290304;
        System.out.println(sFeet+" square feet");
        System.out.println(sMeters+" square meters");
    }
}

