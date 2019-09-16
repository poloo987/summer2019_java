package day13;

public class switchs {
public static void main(String[] args) {
	int num=5;
	switch(num) {
	case 7:
		System.out.println("hello my thean ,how are you? ");
		break;
		
		default: System.out.println("hello my thean ,its cold outhere have a coat ");
		case 5: System.out.println("hello my thean ,please come inside it has become quite and cold ");
		break;
		String days = "tue";
		switch (days) {
		case "mondays ": System.out.println("mondays is fun day");
		break;
		case "tue": System.out.println("tue pizza");
		break;
		default :
			System.out.println("defualt");
			break;
		}
	}

}
}