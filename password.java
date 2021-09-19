package Work;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface passwordInterface {
	 public abstract  boolean passwordValidation( String password);

public class password {
	public static void main(String[] args)
	{
		passwordInterface f1=(passwordid)-> {	
	boolean ispasswordid;
	String passwordidRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$";
	Pattern pattern = Pattern.compile(passwordidRegex);
	
	if (passwordid == null) {
		ispasswordid = false;
	}
	Matcher matcher = pattern.matcher(passwordid);
	ispasswordid = matcher.matches();
	

//check the condition
	if (ispasswordid)
		System.out.println(passwordid + " is an Valid passwordid\n");
	else
		System.out.println(passwordid+ " is an Invalid passwordid");
	return matcher.matches();
	};
System.out.println(f1.passwordValidation("shivani@123"));
}

}



