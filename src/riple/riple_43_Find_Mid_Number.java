package riple;
import java.util.Scanner;
public class riple_43_Find_Mid_Number {
public static void main(String[] args) {
	Scanner bot1=new Scanner(System.in);
	
	System.out.println("Enter first number:");
	int num1=bot1.nextInt();
	System.out.println("Enter second number:");
	int num2=bot1.nextInt();
	System.out.println("Enter third number:");
	int num3=bot1.nextInt();

	int result = 0;
	String result1 = "";
	
	if(num1<num2 && num1>num3 ){  System.out.println("Medium value is:"+num1 ); }
	  if (num1<num3 && num1>num2 ) {System.out.println("Medium value is:"+num1 );}
	  
	if(num2<num3 && num2>num1 ) {System.out.println("Medium value is:"+num2 );}
	  if   (num2<num1 && num2>num3 ) {System.out.println("Medium value is:"+num2 );}
	
    if(num3<num1 && num3>num2 ) {System.out.println("Medium value is:"+num3 );}
      if(num3<num2 && num3>num1 ) {System.out.println("Medium value is:"+num3 );}
  
      
	}
}
	
