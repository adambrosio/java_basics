
public class Zoo {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal("Steve", "Zebra", 500, true);
		Animal animal2 = new Animal("Jeff", "Koala", 25, false);
		Animal animal3 = new Animal("Tina", "Llama", 900, true);
		Bird bird1 = new Bird("Wanda", "Parrot", 15, false);
		Fish fish1 = new Fish("Tottie", "Goldfish", 1, true);
		
		
		animal1.speak();
		animal2.speak();
		animal3.speak();
		
		animal1.running();
		
		bird1.flying();
		fish1.swim();
		bird1.speak();

	}

}
