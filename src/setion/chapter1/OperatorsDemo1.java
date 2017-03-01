package setion.chapter1;

public class OperatorsDemo1 {
	public static void main(String[] args) {
		// Arithmetic Operators + - / * %
		int a = 4 + 5 - 3 % 2 - 4 / 2 - 2 * 3;
		System.out.println(a);
		// Assignment operators
		// = += *= -= /= %=
		int b = 5;
		System.out.println(b);
		// b = b + 5;
		b += 5;
		System.out.println(b);

		// increment/decrement operators
		// post pre
		// ++ --
		int n = 4;
		System.out.println(n);
		// n++;//post
		++n;// pre
		System.out.println(n);

		int d = 5;
		System.out.println(d);
//		System.out.println(d++);
		System.out.println(++d);
		System.out.println(d);
		
		
		int t=5;
		int s=t++;
		System.out.println(t);
		System.out.println(s);
	}
}
