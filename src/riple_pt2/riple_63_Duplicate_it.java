package riple_pt2;
import java.util.Scanner;
public class riple_63_Duplicate_it {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	   
	String answer = word1+word2+word2+word1;
	System.out.println(answer);
}
}
