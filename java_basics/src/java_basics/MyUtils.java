package java_basics;

public class MyUtils {

	public static String printSomeStuff(String argument) {
		
		return argument;
	}
	
	public static void printSomeStuff(int argument) {
		
		System.out.println("Integer passsed in: " + argument);
	}
	
	public static void sumTwoNumbers(int firstArg, int secondArg) {
		
		System.out.println(firstArg + secondArg);
	}
	
	public int add10(int someArg) {
		
		int result = someArg + 10;
		return result;
	}
	
}
