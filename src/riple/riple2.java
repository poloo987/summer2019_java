package riple;

import java.util.Scanner;

public class riple2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		 int n1 = s.nextInt();
		 int n2 = s.nextInt();
		 int n3 = s.nextInt();
		 
		 String answer = (n1>n2 && n1>n3)? "n1 is bigger" 
				 :(n2>n1 && n2>n3)?"n2 is bigger" 
						 :(n3>n1 && n3>n2)?"n3 is bigger":"its bad ";
		 System.out.println(answer);
}
}