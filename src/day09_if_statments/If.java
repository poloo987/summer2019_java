package day09_if_statments;

public class If {
public static void main(String[] args) {
	byte personage  = 19;
			byte voteage =18;
		/*	
			if(personage >= voteage) {
				System.out.println("yes" );}
				if (personage < voteage) {
			System.out.println("no ,grow up"); */
			System.out.println("my thane you want to know if you can vote hmm...");
			String hcgfa= (personage>= voteage )?"yes"
					:(personage < voteage) ?"no, grow up milk drinker"
					: "am sorry my than i dont know ";
			System.out.println(hcgfa);
}
}
