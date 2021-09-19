package Work;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface FirstNameInterface {
	 public abstract  boolean FirstNameValidation( String firstName);

}
public class FirstName {
	public static void main(String[] args)
	{
		FirstNameInterface f1=(firstName)-> {
		boolean isFirstName;
		String firstNameRegex = "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern = Pattern.compile(firstNameRegex);
		if (firstName == null) {
			isFirstName = false;
		}
		Matcher matcher = pattern.matcher(firstName);
		isFirstName = matcher.matches();
		

//check the condition
		if (isFirstName)
			System.out.println(firstName + " is an Valid First Name\n");
		else
			System.out.println(firstName + " is an Invalid First Name");
	return matcher.matches();
		};
	System.out.println(f1.FirstNameValidation("Shivani"));
	}
