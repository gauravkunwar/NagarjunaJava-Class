package setion.chapter1;

public class OperatorsDemo2 {
	public static void main(String[] args) {
		// ternary(conditional)operators
		// ?:

		int a = 5;
		int b = 4;
		boolean result1 = (a > b) ? true : false;
		System.out.println(result1);
		String result2 = (a > b) ? "greater" : "smaller";
		System.out.println(result2);

		// Comparison Operators
		// > < <= >= == !=

		if (a == b) {
			System.out.println("equals");
		}
		if (a > b) {
			System.out.println("a is greater than b");
		}
		if (a < b) {
			System.out.println("a is smaller than b");
		}
		
		//Logical Operators
		//&& || !
	}
}
