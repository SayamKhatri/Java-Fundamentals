package Assignments;
// Take two numbers and print the sum of both.

import java.util.Scanner;

public class Assignment02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Sum of Both numbers is: " + (num1 + num2));
        
    }
    
}
