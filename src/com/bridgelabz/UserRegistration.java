package com.bridgelabz;

import java.util.ArrayList;
public class UserRegistration {
	public static void main(String[] args) {
		ArrayList<String> email = new ArrayList<>();
		UserInputOfEmails emails = new UserInputOfEmails();
		ValidationOfUserRegistration validationOf = new ValidationOfUserRegistration();
//      validationOf.validateFirstName("Digvijay");
//      validationOf.validateLastName("Kadam");
//		validationOf.validateEmailId("digvijaykadam168@gmail.com");
//      validationOf.validateMobileNumber("91 9876543210");
//      validationOf.validatePasswordRuleOne("Digvijay68@)+");
		System.out.println(validationOf.validatePasswordRuleFour("Digvijay@643nhhjj21hg"));
		email = emails.userDataOfEmails();
		for(String e : email){
			validationOf.validateEmailId(e);
		}
	}
}
