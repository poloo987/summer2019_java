package riple;
import java.util.Scanner;
public class riple_033_Citizens {
public static void main(String[] args) {
Scanner bot1= new Scanner (System.in);


System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
int seniorCitizens= bot1.nextInt();
int  nonSeniorCitizens= bot1.nextInt();
System.out.println("What is new citizen's age?");
int  age = bot1.nextInt();

if (age>=65) { {int newseniorCitizens = ++seniorCitizens; } 
                                                           System.out.println("Senior Citizens");}else
if (age<65) { {int newnonSeniorCitizens = ++nonSeniorCitizens; } 
                                                                System.out.println("Senior Citizens");}

System.out.println("New seniorCitizens count "+seniorCitizens); 
System.out.println("New non-seniorCitizens count "+nonSeniorCitizens);
 }
}
