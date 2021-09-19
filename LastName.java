package Work;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface LastNameInterface {
	 public abstract  boolean LastNameValidation( String LastName);

}
public class LastName {
	public static void main(String[] args)
	{
		LastNameInterface f1=(lastName)-> {
		boolean isLastName;
		String LastNameRegex = "^[A-Z]{1}[a-z]{3,}$";
		Pattern pattern = Pattern.compile(LastNameRegex);
		if (lastName == null) {
			isLastName = false;
		}
		Matcher matcher = pattern.matcher(lastName);
		isLastName = matcher.matches();
		

//check the condition
		if (isLastName)
			System.out.println(lastName + " is an Valid Last Name\n");
		else
			System.out.println(lastName + " is an Invalid Last Name");
	
		return matcher.matches();
		};
	System.out.println(f1.LastNameValidation("Pawar"));
}
