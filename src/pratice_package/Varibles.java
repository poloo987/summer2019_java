package pratice_package;

import java.util.Scanner;
 class Varibles{

public static void main (String[]args) {
	Scanner swordcode = new Scanner (System.in);
	double A_num,B_num,answer;
	System.out.println( "my thane enter the first num: ");
	A_num=swordcode.nextDouble();
	System.out.println("my thane enter the second num: ");
	B_num=swordcode.nextDouble();
	answer=A_num % B_num;
	System.out.println("here you aswer my thane");
	System.out.println(answer);
	//=======================================================================//
 	char Mychar='b';int Myint= Mychar;
 	System.out.println(Myint);
 	
}
}
