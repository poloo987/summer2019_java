package riple;
import java.util.Scanner;
public class riple_48_three_nums {
	 public static void main(String[] args) {
		
	
	Scanner s = new Scanner(System.in);
	    
	    
	    int n1 = s.nextInt();
	    int n2 = s.nextInt();
	    int n3 = s.nextInt();
	    
	    //your code here
	    if(n1>n2 && n1>n3 ){  System.out.println( "n1 is bigger"+n1 ); }  
		if(n2>n3 && n2>n1 ) {System.out.println( "n2 is bigger"+n2 );}
	    if(n3>n1 && n3>n2 ) {System.out.println( "n3 is bigger"+n3 );}
	      
	  }
}
