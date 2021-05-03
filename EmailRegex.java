import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex
{
   public static void main(String[] args)
 {

   ArrayList<String> emails = new ArrayList<String>();
   emails.add("abc@yahoo.com");
   emails.add("abc-100@yahoo.com");
   emails.add("abc.100@yahoo.com");
   emails.add("abc-100@abc.net");
   emails.add("abc.100@abc.com.au");
   emails.add("abc@1.com");
   emails.add("abc@gmail.com.com");
   emails.add("abc+100@gmail.com");

    //Invalid emails test
   emails.add("abc"); //must contains"@" symbol
   emails.add("abc@.com.my");
   emails.add("abc123@gmail.a");
   emails.add("abc123@.com");
   emails.add("abc123@.com.com");
   emails.add(".abc@abc.com");
   emails.add("abc()*@gmail.com");
   emails.add("abc@%*.com");
   emails.add("abc..2002@gmail.com");
   emails.add("abc.@gmail.com");
   emails.add("abc@abc@gmail.com");
   emails.add("abc@gmail.com.1a");
   emails.add("abc@gmail.com.aa.au");


//String regex = "^(.+)@(.+)$";
//String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
 //String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
   String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
   Pattern pattern = Pattern.compile(regex);

   for(String email : emails){
       Matcher matcher = pattern.matcher(email);
   System.out.println(email +" : "+ matcher.matches());
  }
}
}
