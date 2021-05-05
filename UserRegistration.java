import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String PATTERN = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	public static void main(String args[]){ 
	    
		Scanner c = new Scanner(System.in);
		System.out.println("Eneter the Email: ");
		String values = c.next();
 
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher = pattern.matcher(values);
		if(matcher.matches()){
			System.out.println("UserEmail "+ values +" is valid");
		}else {
			System.out.println("UserEmail "+ values +" is invalid");
		 
		}
	}
 }
