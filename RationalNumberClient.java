public class RationalNumberClient {
	public static void main(String[] args) {
		RationalNumber r1 = new RationalNumber(4, 1);
		RationalNumber r2 = new RationalNumber(0, 8);
		RationalNumber r3 = new RationalNumber(-2, 12);
		RationalNumber r4 = new RationalNumber(1, -6);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		System.out.println(r3.toDecimal());
	}
}
