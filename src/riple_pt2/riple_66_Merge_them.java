package riple_pt2;
import java.util.Scanner;
public class riple_66_Merge_them {
public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //YOUR CODE HERE
	    String desk; 
	    int counter = 2;
	    if(word1.length()==3 && word2.length()==3){
	    	 
	    	for (int x = 0; x <word1.length()- counter;++x) { desk.concat(""+word1.charAt(x));}
	    		for (int y = 0; y<word1.length()- counter;++y) {desk.concat(""+word2.charAt(y));} 
	    		if (counter == 0) {break;
	    		System.out.println( desk);
	    		}else {--counter;}
	    	
	    }else {System.out.println("cannot merge"); }
	
	    
}
}
