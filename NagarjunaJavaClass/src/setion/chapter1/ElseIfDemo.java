package setion.chapter1;

public class ElseIfDemo {
	public static void main(String[] args) {
		int marks = 50;
		if (marks > 79 && marks <= 100) {
			System.out.println("distinction");
		} else if (marks > 59 && marks <= 79) {
			System.out.println("first");
		} else if (marks > 39 && marks <= 59) {
			System.out.println("second");
		} else {
			System.out.println("fail");
		}
		System.out.println("rest of code");
	}
}
