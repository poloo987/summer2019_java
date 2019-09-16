package riple;
import java.util.Scanner;
public class riple_44_blackjack {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int house = s.nextInt();
	    int player = s.nextInt();

	    if (house>21) {System.out.println("bust");
	    } else if (house<=21 && player< house  ){System.out.println("player loss");
	    } else if (house == player  ){System.out.println("its a tie");
	    } else if (player <=21 && house< player  ){System.out.println("player wins");}	    
}
}