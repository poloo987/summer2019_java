package pratice_package;

//import java.util.Scanner;

public class Textbook {
	public static void main(String[] args) {
		int num1 = 46;
		int num2 = 90;
		int sum = num1 + num2;
		System.out.println(
				"hello my thane I am back from Riften.\n I did as you told me and  gatherer the coin from your last two jobs");
		System.out.println("from the numbers job you got payed " + num1
				+ " gold and from the last house you let your self in you got " + num2);
		System.out.println(" in adding thos two amounts your sum is " + sum + " maybe now you will buy my ale?");

		double F = 100;
		double C = (5 * (F - 32)) / 9;
		System.out.println(C);

		double mil = 25;
		double km = mil * 1.609344;
		System.out.println(km);


		/*
		 * 1. Write a Java program that displays the area and perimeter of a circle. the
		 * circle has a radius of 5.5 using the following formulas: perimeter = 2 *
		 * radius * 3.14 area = radius * radius * 3.14
		 */
		double r = 5.8;
		double p = 2 * r * 3.14;
		double a = r * r * 3.14;

		System.out.println("the area and perimeter of a circle with a radius of 5.5 is as showen below");

		System.out.println(a + "is the area and the perimeter is " + p);

		double w = 4, h = 2, A2 = w * h;
		System.out.println(A2);
// r=5,w=4,h=2
		double ave = (r + w + h) / 3;
		System.out.println(ave);
		byte bb = 12;
		float bbb = bb;

		float kk = 894.4f;

		int ll = (int) kk;
		System.out.println(ll);

		// =========================================
		double piePerson;
		int pie = 10, people = 4;
		piePerson = pie / people;
		System.out.println(piePerson);

		int P3 = 10, PP3 = 4;
		double PPP3;
		PPP3 = P3 / (double) PP3;
		System.out.println(PPP3);

		int P2 = 10, PP2 = 4;
		double PPP2;
		PPP2 = (double) P2 / PP2;
		System.out.println(PPP2);

		int P4 = 10, PP4 = 4;
		double PPP4;
		PPP4 = (P4 / 4.0);
		System.out.println(PPP4);

		System.out.println((int) (7.9) + (int) (6.7));
		System.out.println((int) (7.9 + 6.7));
		System.out.println((double) (17));
		System.out.println((double) (3));
		System.out.println((double) (8 + 3));
		System.out.println((double) (7) / 2);
		System.out.println((double) (7 / 2));
		System.out.println((int) (7.8 + (double) (15 / 2)));

		short AA = 30000;
		short AAA = 30000;
		short DD = (short)(AA + AAA);
		System.out.println(DD);
		
		int a1 = 2, a2 = 3;
		System.out.println(a1++ + a2 + a1);

	}

}
