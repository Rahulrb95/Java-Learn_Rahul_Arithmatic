

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailValidate {

public static void main(String[] args) {
		
		System.out.println("Please enter your email address::");
		
		Scanner scanEmail = new Scanner(System.in);
		
		String enteredUserEmail = scanEmail.next();
		
		System.out.println("Email Address entered by the user:: " + enteredUserEmail);
		
		List<String> predefinedEmailList = new ArrayList<>();
		predefinedEmailList.add("rahulvb@gmail.com");
		predefinedEmailList.add("rahulvb9527@gmail.com");
		predefinedEmailList.add("vishalrb@gmail.com");
		
		
		EmailValidate emailValidator = new EmailValidate();
		
		String emailValidationStatus = emailValidator.checkForValidEmailAddress(enteredUserEmail, predefinedEmailList);
		
		System.out.println(emailValidationStatus);
	}
	
	private String checkForValidEmailAddress(String userEnteredEmail, List<String> validEmailList) {
		
		String status;
		for(int index = 0; index < validEmailList.size(); index++) {
		
			if(validEmailList.get(index).equals(userEnteredEmail)) {
				
				status = userEnteredEmail + " is valid";
				return status;
			}
			
		}
		status = userEnteredEmail + " is not valid";
		
		return status;
		
	}

}
