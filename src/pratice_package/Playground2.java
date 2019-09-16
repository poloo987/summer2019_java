package pratice_package;

public class Playground2 {
	 public static void main(String[] args) {
		int x=2,y=x++,z=8,w=z--;
		System.out.println(y);
		System.out.println(x++);
		System.out.println(--x);
		System.out.println(w);
		//*2,2,8 insted I got 3,3,8  why ? bug is x=2 for all four the lines  of code
		int a= 4;
		a=-a-- + a++/-a-- * --a;
		System.out.println(a);
		int b=50;
		b=--b+ b++ + b-- + b++;
		System.out.println(b);
		int r =4;
		int p =r*4-r++;
		System.out.println(p);
		//========================
		int ball= 198;
				
				if (ball%2== 0 ) {System.out.println("even");}
				
	}
		
	}

