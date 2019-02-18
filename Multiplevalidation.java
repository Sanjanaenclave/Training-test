package newproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Multiplevalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplevalidation mv = new Multiplevalidation();
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner ss = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = ss.nextLine();
		if(mv.nameValidation(name)) {
			System.out.println(name);
		}
		else {
			System.out.println("Invalid name");
		}
		
		System.out.println("Enter your email: ");
		String email = ss.nextLine();
		if(mv.emailValidation(email)) {
			System.out.println(email);
		}
		else {
			System.out.println("Invalid email");
		}
		System.out.println("Enter your number: ");
		String number = ss.nextLine();
		
		if(mv.numberValidation(number)) {
			System.out.println(number);
		}
		else {
			System.out.println("Invalid number");
		}
		

		
	}
	
	public static boolean nameValidation(String nametest) {
		Pattern pattern = Pattern.compile(new String ("^[a-zA-Z\\s]*$"));
		Matcher matcher = pattern.matcher(nametest);
		return matcher.matches();
		
	}
	public static boolean emailValidation(String emailtest) {
		
		if(emailtest.endsWith("@infosys.com")) {
			return true;
		}
		else {
			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
	                "[a-zA-Z0-9_+&*-]+)*@" + 
	                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
	                "A-Z]{2,7}$";
			Pattern pat = Pattern.compile(emailRegex); 
			return pat.matcher(emailtest).matches();
		}
		
	}
	
	public static boolean numberValidation(String numbertest) {
	
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
		Matcher m = p.matcher(numbertest);
		return (m.find() && m.group().equals(numbertest)); 
	}
	

}
