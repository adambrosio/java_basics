
public class Bird {
	
	String type;
	String color;
	public Bird(String type, String color) {
		super();
		this.type = type;
		this.color = color;
	}
	
	public void flying() {
		System.out.println("The " + type + " is flying and its color is " + color);
	}

}
