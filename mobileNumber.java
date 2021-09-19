package Work;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface mobileNumberInterface {
	 public abstract  boolean mobileNumberValidation( String mobileNumber);

public class mobileNumber {
	public static void main(String[] args)
	{
		mobileNumberInterface f1=(mobileNumberid)-> {	
	boolean ismobileNumberid;
	String mobileNumberidRegex = "^[0-9]{2}\\s{1}[0-9]{10}$";
	Pattern pattern = Pattern.compile(mobileNumberidRegex);
	
	if (mobileNumberid == null) {
		ismobileNumberid = false;
	}
	Matcher matcher = pattern.matcher(mobileNumberid);
	ismobileNumberid = matcher.matches();
	

//check the condition
	if (ismobileNumberid)
		System.out.println(mobileNumberid + " is an Valid mobileNumberid\n");
	else
		System.out.println(mobileNumberid+ " is an Invalid mobileNumberid");
	return matcher.matches();
	};
System.out.println(f1.mobileNumberValidation("9552639242"));
}

}




}
