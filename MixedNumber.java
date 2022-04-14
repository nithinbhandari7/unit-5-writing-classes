public class MixedNumber implements Comparable<MixedNumber>{
	private int whole;
	private RationalNumber frac;
	
	//precondition - d is non zero, and n and d are non negative
	public MixedNumber(int w, int n, int d) {
		if(d <= 0 || n < 0) {
			throw new IllegalArgumentException();
		}
		if(w >= 0) {
			whole = w + n / d;
			n %= d;
			frac = new RationalNumber(n, d);
		} else {
			whole = w - n / d;
			n %= d;
			frac = new RationalNumber(-n, d);
		}
	}
	
	public MixedNumber(RationalNumber rat) {
		whole = rat.getNumerator() / rat.getDenominator();
		frac = new RationalNumber(rat.getNumerator() % rat.getDenominator(), rat.getDenominator());
	}
	
	public String toString() {
		if(whole == 0) {
			return frac.toString();
		} else if (frac.getNumerator() == 0) {
			return whole + "";
		} else if (whole > 0) {
			return whole + " " + frac.toString();
		} else {
			return whole + " " + Math.abs(frac.getNumerator()) + "/" + frac.getDenominator();
		}
	}
	
	public boolean equals(Object o) {
		MixedNumber other = (MixedNumber)o;
		return this.whole == other.whole && this.frac.equals(other.frac);
	}
	
	public int compareTo(MixedNumber op) {
		RationalNumber thisRat = this.toRationalNumber();
		RationalNumber opRat = op.toRationalNumber();
		return thisRat.compareTo(opRat);
	}
	
	public RationalNumber toRationalNumber() {
		return new RationalNumber(whole*frac.getDenominator() + frac.getNumerator(), frac.getDenominator());
	}
	
	public double toDecimal() {
		return this.toRationalNumber().toDecimal();
		
	}
	
	public MixedNumber add(MixedNumber op) {
		RationalNumber thisRat = this.toRationalNumber();
		RationalNumber opRat = op.toRationalNumber();
		RationalNumber sum = thisRat.add(opRat);
		return new MixedNumber(sum);
	}
	
	public MixedNumber subtract(MixedNumber op) {
		RationalNumber thisRat = this.toRationalNumber();
		RationalNumber opRat = op.toRationalNumber();
		RationalNumber subtract = thisRat.subtract(opRat);
		return new MixedNumber(subtract);
	}
	
	public MixedNumber multiply(MixedNumber op) {
		RationalNumber thisRat = this.toRationalNumber();
		RationalNumber opRat = op.toRationalNumber();
		RationalNumber multiply = thisRat.multiply(opRat);
		return new MixedNumber(multiply);
	}
	
	public MixedNumber divide(MixedNumber op) {
		RationalNumber thisRat = this.toRationalNumber();
		RationalNumber opRat = op.toRationalNumber();
		RationalNumber divide = thisRat.divide(opRat);
		return new MixedNumber(divide);
	}
}
