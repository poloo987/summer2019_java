package riple;
import java.util.Scanner;
public class riple_59_Print_first_character {
	public static void main(String[] args) {
	    System.out.println(" would you type in a word please?");
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	   
	    // --charAt Int. / char
	 //  char dog = word.charAt(0);
	
	   
	   char paw = word.charAt (0);
	   System.out.println(paw);
	  }
}
