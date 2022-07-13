package com.bridgelabz;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact=1;
        int i=1;
        System.out.println("Enter number to calculate factorial");
        int number=sc.nextInt();
        //for(int i=1;i<=number;i++)
        while(i<=number)
        {
           fact=fact*i;
           i++;
        }
        System.out.println("Factorial of "+number+" is "+fact);
    }
}
