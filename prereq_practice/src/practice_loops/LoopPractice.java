package practice_loops;

public class LoopPractice {

	public static void main(String[] args) {
		
		String str = "We have a large inventory of things in our warehouse falling in " 
		+ "the category:apparel and the slightly " 
		+ "more in demand category:makeup along with the category:furniture and...";

		printCategories(str);
	}
	
	public static void printCategories(String string) {
		
		int i = 0;
		
		while(true) {
			int found = string.indexOf("category:", i);
			if (found == -1) break;
			int start = found + 9;
			int end = string.indexOf(" ", start);
			System.out.println(string.substring(start, end));
			i = end + 1;
		}
		
	}

}
