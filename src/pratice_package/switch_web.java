package pratice_package;
/*int dog =2;
	switch (dog) {
	case 1:
		System.out.println("case 1");
	case 2:
		System.out.println("case 2");
	case 3:
		System.out.println("case 3");
	case 4:
		System.out.println("case 4");
		default:
			System.out.println("default");
		
  } 
  ==============================================*/

import java.util.Scanner;
public class switch_web {
public static void main(String[] args) {

	double num1 ,num2;
	Scanner scanner = new Scanner(System.in);
	
	 num1 = scanner.nextDouble();
	 System.out.print("Enter second number:");
     num2 = scanner.nextDouble();

     System.out.print("Enter an operator (+, -, *, /): ");
     char operator = scanner.next().charAt(0);

     scanner.close();
     double output;
	
     switch (operator) {
     case '+' :
    	 output= num1 + num2;
    	 break;
     case '-':
    	 output= num1 - num2;
    	 break;
     case '/':
    	 output= num1 / num2;
    	 break;
     case '*':
    	 output= num1 * num2;
    	 break;
     default:
    	 System.out.printf("You have entered wrong operator");
         return;
    }
     System.out.println(num1+" "+operator+" "+num2+": "+output);
 }
}
