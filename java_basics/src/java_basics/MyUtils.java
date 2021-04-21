package java_basics;

public class MyUtils {

	public static void printSomeStuff(String argument) {
		
		System.out.println("Created method print " + argument);
	}
	
	public static void printSomeStuff(int argument) {
		
		System.out.println("Integer passsed in " + argument);
	}
	
	public static void sumTwoNumbers(int firstArg, int secondArg) {
		
		System.out.println(firstArg + secondArg);
	}
	
	public static int add10(int someArg) {
		
		int result = someArg + 10;
		return result;
	}
	
}
