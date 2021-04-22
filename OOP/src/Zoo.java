
public class Zoo {

	public static void main(String[] args) {
		
		Flyable flyingBird = new Sparrow("Timmy", "Sparrow", 5, true);
		// Bird does not implement Flyable interface like Sparrow does
		//Flyable flyingBird2 = new Bird("Timmy", "Sparrow", 5, true);
		flyingBird.fly();
	}

}
