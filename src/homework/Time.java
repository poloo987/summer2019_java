package homework;

/* int hour = 04, minute=42,second= 12;
System.out.println("Like this: " +hour+":"+minute+":"+second+"PM");*/

public class Time {
	public static void main(String[] args) {
		int hour = 22, minute = 42, second = 12;
		char shift = 'A';
		String errorMsg = null;
		if (hour < 24 && hour >= 0) {
			if (minute < 60 && minute >= 0) {
				if (second < 60 && second >= 0) {
					if (hour > 12) {
						shift = 'P';
						hour = hour - 12;
					}
					System.out
							.println("My Thane the time is " + hour + ":" + minute + ":" + second + " " + shift + "M");
					return;
				} else { errorMsg = "Hours incorrect"; }
			} else { errorMsg = "Minutes incorrect"; }
		} else { errorMsg = "Seconds incorrect";  }
		System.out.println("error: " + errorMsg);
	}
}
