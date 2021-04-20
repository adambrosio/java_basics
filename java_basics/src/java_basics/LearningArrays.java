package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		
		// Indices without values defined default to 0
		int [] values = new int[100];
		values[0] = 1000;
		values[99] = 9999;
		
		System.out.println(values[99]);
		
		// Declare array with curly braces
		String [] words = new String[] {"My", "name", "is"};
		
		System.out.println(words[2]);


	}

}
