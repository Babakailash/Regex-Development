import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;
public class UserRegistration {
	
	private static final String PATTERN = "^[A-Z][a-z]{3}$";
	public static void main(String args[]){ 
	    
		Scanner c = new Scanner(System.in);
		System.out.println("Eneter the First Name: ");
		String values = c.next();
 
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher = pattern.matcher(values);
		if(matcher.matches()){
			System.out.println("Username "+ values +" is valid");
		}else {
			System.out.println("Username "+ values +" is invalid");
		}		  
	}
}
