
public class Animal {

	String name;
	String type;
	int weight;
	boolean isEating;
	
	public Animal(String name, String type, int weight, boolean isEating) {
		super();
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.isEating = isEating;
	}
	
	public void speak() {
		System.out.println("My name is " + name);
		System.out.println("I am a " + type);
		System.out.println("My weight is " + weight + "lbs");
		System.out.println("Eating: " + isEating);
	}
	
	public void sleeping() {
		System.out.println("Sleeping...");
	}
	
	public void playing() {
		System.out.println("Playing...");
	}
	
	public void running() {
		System.out.println("Running...");
	}
	
}

