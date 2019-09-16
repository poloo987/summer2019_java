package riple;
import java.util.Scanner;
public class riple_53_Ternary_Operator2 {
	 public static void main(String[] args) {
		    //DO NOT CHANGE
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter number1:");
				int num1 = scan.nextInt();
				System.out.println("Enter number2:");
				int num2 = scan.nextInt();
				//WRITE YOUR CODE HERE
			  int bob = (num1 > num2)? num1: (num1);
			  System.out.println(bob);
	 }
}
