package setion.chapter1;

public class NestedIfElseDemo {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 7;
		if (a > b) {
			if (a > c) {
				System.out.println("a is greateest one");
			} else {
				System.out.println("a is greater than b but smaller than c");
			}
		} else {
			System.out.println("a is smaller than b but c...");
		}
	}
}
