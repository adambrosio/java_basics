package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		
		boolean hungry = false;
		
		if(!hungry) {
			System.out.println("I am hungry.");
		} else {
			System.out.println("Not hungry.");
		}
		
		int hungerRating = 5;
		
		if(hungerRating < 6) {
			System.out.println("Not hungry.");
		} else {
			System.out.println("Pretty hungry.");
		}
		
		int favoriteTemp = 75;
		int currentTemp = 100;
		String opinion;
		
		if(favoriteTemp == currentTemp) {
		
			if(currentTemp < (favoriteTemp - 30)) {
				opinion = "It's cold...";
			} else if(currentTemp < (favoriteTemp - 20)) {
				opinion = "Temperature is mild...";
			} else if(currentTemp > (favoriteTemp + 10)) {
				opinion = "It's hot...";
			} else {
				opinion = "It's a beautiful day...";
			}
		}
		else {
			opinion = "Unknown temp";
		}
		
		System.out.println(opinion);
	
		
		int month = 4;
		String monthString;
		
		switch(month) {
		case 1: monthString = "January";
			break;
		case 2: monthString = "February";
			break;
		case 3: monthString = "March";
			break;
		case 4: monthString = "April";
			break;
		default: monthString = "Unknown month";
			break;
		}
		
		System.out.println(monthString);
	}

	
}
