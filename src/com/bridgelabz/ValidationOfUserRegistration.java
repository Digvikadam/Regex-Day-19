package com.bridgelabz;

import java.util.Scanner;

/**
 * This class is for validation of User registration
 * Taking user input and checking whether data is in correct format
 */
public class ValidationOfUserRegistration {
    //Scanner class to take the input from the user
    Scanner scanner = new Scanner(System.in);

    /**
     * this method is to check the first name whether its in correct format are not
     */
    public void validateFirstName(){
        System.out.println("Enter the First Name");
        String firstName = scanner.next();
        String regex = "^[A-Z][a-z]{2,}$";
        System.out.println(firstName.matches(regex));
    }

    /**
     * this method is to check whether the last name entered is correct ot not
     */
    public void validateLastName(){
        System.out.println("Enter the Last Name");
        String lastName = scanner.next();
        String regex = "^[A-Z][a-z]{2,}$";
        System.out.println(lastName.matches(regex));

    }
}