package riple;
import java.util.Scanner;
public class riple_22 {
public static void main(String[] args) {
	Scanner bot1= new Scanner (System.in);
	
	System.out.println("Enter Item1 and its price:");
	String i1= bot1.next ();
	double p1 = bot1.nextDouble();
	
	System.out.println("Enter Item2 and its price:");
	String i2= bot1.next ();
	double p2 = bot1.nextDouble();
	
	System.out.println("Enter Item3 and its price:");
	String i3= bot1.next ();
	double p3 = bot1.nextDouble();
   
	//"Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3""Total price: 15.3"
	double tp = p1+p2+p3;
	String rop = ("Item1: "+i1+" Price: "+p1+","+" Item2: "+i2+" Price: "+p2+","+" Item3: "+i3+" Price: "+p3+"\nTotal price: "+tp);
	System.out.println(rop);
	
	
}
}
