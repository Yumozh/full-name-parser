package com.pluralsight;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String fullName = input.nextLine().trim();

        String[] names = fullName.split(" ");

        String firstName = names[0];
        String middleName;
        String lastName;
        if(names.length == 3){
            middleName = names[1];
            lastName = names[2];
        }else{
            lastName = names[1];
            middleName = "none";
        }

        System.out.printf("First name: %s\nMiddle name: %s\nLast name: %s\n",firstName, middleName, lastName);

    }
}
