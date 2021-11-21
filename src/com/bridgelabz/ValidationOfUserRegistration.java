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
     * @param firstName
     */
    public void validateFirstName(String firstName){
        String regex = "^[A-Z][a-z]{2,}$";
        System.out.println(firstName.matches(regex));
    }

    /**
     * this method is to check whether the last name entered is correct ot not
     * @param lastName
     */
    public void validateLastName(String lastName){
        String regex = "^[A-Z][a-z]{2,}$";
        System.out.println(lastName.matches(regex));

    }

    /**
     * this method is to check whether the emailId is in correct format
     * @param emailId
     */
    public void validateEmailId(String emailId){
        String regex = "^[A-Za-z0-9-._]{1,}+@+[a-z]{1,}+.+[a-z]$";
        System.out.println(emailId.matches(regex));
    }

    /**
     * this method is to validate Mobile number
     * @param mobileNumber
     */
    public void validateMobileNumber(String mobileNumber){
        String regex = "^[0-9]{2}+ +[0-9]{10}$";
        System.out.println(mobileNumber.matches(regex));
    }
}