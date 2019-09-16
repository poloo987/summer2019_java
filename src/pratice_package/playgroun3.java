package pratice_package;
import java.util.Scanner;
public class playgroun3 {
public static void main(String[] args) {
	Scanner bot1 = new Scanner(System.in);
int num= bot1.nextInt();
String turtle = (num >= '9')?"pizza":"no pizza";
System.out.println(turtle);
}
}