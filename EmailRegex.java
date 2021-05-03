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
 
    //Invalid emails
   emails.add("abc#yahoo.com");
   emails.add("@yahoo.com");
 
   String regex = "^(.+)@(.+)$";
 
   Pattern pattern = Pattern.compile(regex);
 
   for(String email : emails){
       Matcher matcher = pattern.matcher(email);
   System.out.println(email +" : "+ matcher.matches());
  }
}
}
