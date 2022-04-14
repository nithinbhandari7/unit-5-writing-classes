public class MixedNumberClient {
	public static void main(String[] args) {
		MixedNumber m1 = new MixedNumber(-2, 7, 5);
		MixedNumber m2 = new MixedNumber(new RationalNumber(16, 3));
		MixedNumber m3 = new MixedNumber(8, 0, 9);
		MixedNumber m4 = new MixedNumber(new RationalNumber(8, 22));
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
}
