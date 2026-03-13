package Assignments;
// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;
public class Assignment04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sum = 0;
        while (true) {
            System.out.println("Enter a number or enter 'x': ");
            String in = input.nextLine();

            if (in.equalsIgnoreCase("X")) {
                break;
            }

            int num = Integer.parseInt(in);
            sum += num;
        } 
        System.out.println("The Sum is: " + sum);
}

}