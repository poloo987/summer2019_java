package riple;
import java.util.Scanner;
public class ripe_42_Vehicle_recall {
	
	  public static void main(String[] args) {
		  
		  Scanner bot1=new Scanner(System.in);
		  int vehicleYear = bot1.nextInt();
		  String tub= "Your vehicle needs to be recalled!";
                   if (vehicleYear >=1995 && vehicleYear<=1998){ System.out.println(tub);
	         }else if (vehicleYear >=2001 && vehicleYear<=2002){ System.out.println(tub);
		     }else if (vehicleYear >=2004 && vehicleYear<=2006){ System.out.println(tub);
		     }else if (vehicleYear >=2015 && vehicleYear<=2017){ System.out.println(tub);
		     }else {System.out.println("Your vehicle is fine, enjoy!");}

	  }
	  }