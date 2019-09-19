package riple;
import java.util.Scanner;
public class riple_60_Print_last {
	 public static void main(String[] args) {
		    //DO NOT CHANGE
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    String L1 = word.substring(0,1);
		    int L2 = word.length ()-1;
		    String L3 = word.substring(L2);
		    String fine = L1.concat(L3);
		    System.out.println(fine);
		  }
}
