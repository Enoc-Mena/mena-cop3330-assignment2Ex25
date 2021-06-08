/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex25;
import java.util.Scanner;

public class Ex25 {

    static void passwordValidator(String passWord, int n) {

        //Check if password is only digits and fewer than 8 char
        for(int i = 0; i < passWord.length(); i++) {

            if(Character.isDigit(passWord.charAt(i)) && passWord.length() < 8) {

                System.out.print("The password '" + passWord + "' is a very weak password.");
                System.exit(0);

            }

        } //End for loop

        //Check if password is only letters and fewer than 8 char
        for(int i = 0; i < passWord.length(); i++) {

            char c = passWord.charAt(i);

            if(!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && passWord.length() < 8) {

                //Returns false

            }

            //Returns true
            System.out.print("The password '" + passWord + "' is a very weak password.");
            System.exit(0);

        } //End for loop

        //Check if password has letters and at least 1 number
        for(int i = 0; i < passWord.length(); i++) {

            char ch = passWord.charAt(i);

            if(Character.isLetterOrDigit(passWord.charAt(i)) && passWord.length() >= 8) {

                System.out.print("The password '" + passWord + "' is a strong password.");
                System.exit(0);

            }

        } //End for loop

        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";

        //Checks if password has letters, numbers and special char
        for(int i = 0; i < passWord.length(); i++) {

            char ch1 = passWord.charAt(i);

            if(specialCharactersString.contains(Character.toString(ch1)) && Character.isLetterOrDigit(passWord.charAt(i)) && passWord.length() >= 8) {

                System.out.print("The password '" + passWord + "' is a very strong password.");

            }

        } //End for loop


    }

    public static void main(String[] args) {

        String pass;

        Scanner userPass = new Scanner(System.in);
        System.out.print("Enter a password to check: ");
        pass = userPass.nextLine();

        int len = pass.length();

        passwordValidator(pass, len);

    }

}

