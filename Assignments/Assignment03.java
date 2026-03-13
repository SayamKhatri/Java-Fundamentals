package Assignments;
// Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class Assignment03 {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num*i);
        }
    }
}