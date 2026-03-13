package Assignments;
// 1. Write a program to print whether a number is even or odd, also take input from the user.
// 2. Take name as input and print a greeting message for that particular name.
// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
// 5. Take 2 numbers as input and print the largest number.
// 6. To calculate Fibonacci Series up to n numbers.
// 7. To find Armstrong Number between two given number.

import java.util.Scanner;

public class Assignment05 {
    public static void main(String[] args) {
        // System.out.println(fun6(10));
        System.out.println(ArmStrong(154));
        
    }

    public static String fun1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        int num = input.nextInt();

        if (num % 2 == 0) 
            return "Even";
        else 
            return "Odd";
    }

    public static String fun2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your name: ");
        String name = input.nextLine();

        return "Hello " + name;
    }

    public static int fun3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal: ");
        int p = input.nextInt();
        System.out.println("Enter Time: ");
        int t = input.nextInt();
        System.out.println("Enter ROI: ");
        int r = input.nextInt();

        return (p * t * r) / 100;
    }

    public static float fun4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number 1: ");
        int num1 = input.nextInt();
        System.out.print("Please Enter the number 2: ");
        int num2 = input.nextInt();

        System.out.print("Please Enter the Operator: ");
        String op = input.next();
        
        if (op.equals("+")) {
            return num1 + num2;
        } 
        else if (op.equals("-")) {
            return num1 - num2;
        }
        else if (op.equals("*")) {
            return num1 * num2;
        }
        else {
            return num1/num2;
        }
    }

    public static int fun5() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number 1: ");
        int num1 = input.nextInt();
        System.out.print("Please Enter the number 2: ");
        int num2 = input.nextInt();
        System.out.print("Please Enter the number 3: ");
        int num3 = input.nextInt();

        int max = num1;
        if (num2 > max) {
            max = num2;
        } 

        if (num3 > max) {
            max = num3;
        }

        return max;
    }

    public static int fun6(int n) {
        int num1, num2, num3;
        num1 = 0;
        num2 = 1;
        num3 = 0;

        if (n == 0) return num1;
        if (n == 1) return num2;

        while (n >= 2) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            n--;
        }

        return num3;

    }

    public static Boolean ArmStrong(int num) {
        int n = num;
        int res = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            res += (rem* rem* rem);
        } 

        return res == n;
    }

}