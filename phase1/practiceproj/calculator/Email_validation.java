package phase1.practiceproj.calculator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_validation {
	public static boolean isValidEmail(String email) {
		 String regex = "^(.+)@(.+)$";
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(email);
		 return matcher.matches();
		 
		 }
		 public static void main(String[] args) {
		 List<String> emails = new ArrayList<String>();
		 // valid emails
		 emails.add("sachin@xyz.com");
		 emails.add("rahul@mail.com");
		 emails.add("pavan@mail.me.org");
		 //invalid emails
		 emails.add("bro.email.com");
		 emails.add("prubs..ns#sara.com");
		 emails.add("@.sara.com");
		 for (String value : emails) {
		 System.out.println("The Email address " + value + " is " + 
		(isValidEmail(value) ? "valid" : "invalid"));
		 }
		 
		 System.out.println("Enter any email address to check");
		 Scanner sc = new Scanner(System.in);
		 String input = sc.nextLine();
		 System.out.println("The Email address " + input + " is " + 
		(isValidEmail(input) ? "valid" : "invalid"));
		 
		 }
}