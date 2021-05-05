import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String PATTERN = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
	public static void main(String args[]){ 
	    
		Scanner c = new Scanner(System.in);
		System.out.println("Eneter Password: ");
		String values = c.next();
 
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher = pattern.matcher(values);
		if(matcher.matches()){
			System.out.println("User's Password "+ values +" is valid");
		}else {
			System.out.println("User's Password "+ values +" is invalid");
		 
		}

	}
}
