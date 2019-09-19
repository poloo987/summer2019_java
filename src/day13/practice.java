package day13;

public class practice {
public static void main(String[] args) {
	String str ="ALL THE LETTERS";
	String unique= "";	
int count =0 ;
 for (int i=0; i < str.length ()-1;i++) {
 if (str.substring(i,i+1).equals("A")) {
  count++;}
 }
 if (count ==1) { unique+="A";}
 }
}
