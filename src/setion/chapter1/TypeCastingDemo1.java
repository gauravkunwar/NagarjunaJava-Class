package setion.chapter1;

public class TypeCastingDemo1 {
	public static void main(String[] args) {
		byte b = 127;
		//implicit type casting(by compiler)
		int i = b;
		System.out.println(b);
		System.out.println(i);
		
		int ii=127;
		//explicit type casting(by java programmer)
		byte bb=(byte)ii;
		System.out.println(ii);
		System.out.println(bb);
	}
}
