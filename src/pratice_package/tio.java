package pratice_package;
import java.util.Scanner;
public class tio {
public static void main(String[] args) { 
Scanner bot1=new Scanner (System.in);
System.out.println("enter your frist and last name");
	String first = bot1.nextLine().toLowerCase ();
	String last = bot1.nextLine();
	String fullname = first.concat(last);
		int num = fullname.length();
	System.out.println(fullname+" contains "+num+" charters");
	
	String moon = " hello my thane";
String luna = moon.substring (1,6);
System.out.println(luna);

}
}