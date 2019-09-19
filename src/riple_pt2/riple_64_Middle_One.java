package riple_pt2;
import java.util.Scanner;
public class riple_64_Middle_One {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    int num = word.length();
	    String mid;
	    //YOUR CODE HERE
	    if (word.length()%2== 1 &&  word.length () >= 3){
	      mid= ""+word.charAt(word.length()/2);
	    }else if (word.length()==1){ 
	      mid= word+word+word;
	    }else if (word.length()%2== 0 && word.length () >= 3){
	      mid= word.substring( word.length()/2-1,word.length()/2+1);
	    }else { mid= ""+ word+word; } 
	      System.out.println(mid);
	   
	    
	  }
	}
