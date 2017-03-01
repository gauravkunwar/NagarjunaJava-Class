package setion.chapter1;

public class ImplicitTypeCasting {
	public static void main(String[] args) {
		// implicit casting
		byte b = 100;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;

		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		System.out.println(d);
		System.out.println(f);

	}
}
