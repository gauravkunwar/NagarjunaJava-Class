package setion.chapter1;

public class ExplicitCastingDemo {
	public static void main(String[] args) {
		double d = 100.45;
		float f = (float) d;
		long l = (long) f;
		int i = (int) l;
		short s = (short) i;
		byte b = (byte) s;

		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		
		byte bb=(byte)200;
		System.out.println(bb);
		//11001000
		//00110111
		//       1
		//00111000
//		boolean flag=true;
//		int ii=(int)flag;
	}
}
