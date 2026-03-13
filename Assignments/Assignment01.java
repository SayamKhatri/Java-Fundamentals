package Assignments;
// 1. Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year you want to check: ");
        int year = input.nextInt();
        if (year % 4 == 0) {
            System.out.println("This is a Leap Year");
        }
        else {
            System.out.println("Not a leap Year");
        }

    }
    
}
