import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String PATTERN = "^(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";
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
