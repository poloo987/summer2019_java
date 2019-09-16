package riple;
import java.util.Scanner;
public class riple3 {
	  public static void main (String[] args){
		  Scanner scan = new Scanner(System.in);
		  int areaCode =scan.nextInt(),
		      localNumber =scan.nextInt();
		  String  phoneNumber_variable ="-("+areaCode+")-"+localNumber ;
		  System.out.println("Calling number "+phoneNumber_variable);
}
}