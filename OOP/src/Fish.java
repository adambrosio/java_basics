
public class Fish extends Animal {
	
	public Fish(String name, String type, int weight, boolean isEating) {
		super(name, type, weight, isEating);

	}

	public void swim() {
		System.out.println("Swimming...");
	}

	public void move() {
		System.out.println("Fish is swimming...");
		
	}
}
