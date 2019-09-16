package riple;
import java.util.Scanner;
public class riple_52_Ternary {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter number:");
		int x = scan.nextInt();
		
		int thing = (x>=5)? x :(x<5)? x*-1: 2;
		System.out.println(thing);
}
}
