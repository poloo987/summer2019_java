package homework;
import java.util.Scanner;
public class Web_Address {
public static void main(String[] args) {
	Scanner bot1 = new Scanner (System.in);
	System.out.println(" good day master , please enter a URL.. ");
	String url = bot1.nextLine();
	//https://www.youtube.com/
	System.out.println("processing input..please wait.");
	//String url2 = url.replaceFirst(7,"  " );
	String url1 = url.trim();
	 if(url1.startsWith("www.")){System.out.println("25% of processing complete..please wait.");
	 }else if (url1.endsWith("com")){System.out.println("Extension: com" );
	 }else if (url1.endsWith("net")){System.out.println("Extension: net" );
	 }else if (url1.endsWith("edu")){System.out.println("Extension: edu" );
	 }else if (url1.endsWith("org")){System.out.println("Extension: org" );
	 }else if (url1.endsWith("gov")){System.out.println("Extension: gov" );
	 
	 }else System.out.println("error");
}
}
