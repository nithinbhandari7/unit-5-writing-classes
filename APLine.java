public class APLine {
	private int a;
	private int b;
	private int c;
	
	public APLine(int userA, int userB, int userC) {
		a = userA;
		b = userB;
		c = userC;
	}
	
	public double getSlope() {
		return -a/(double)b;
	}
	
	public boolean isOnLine(int x, int y) {
		int sum = (a * x) + (b * y) + c;
		if(sum == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		APLine line1 = new APLine(5, 4, -17);
		double slope1 = line1.getSlope();
		boolean onLine1 = line1.isOnLine(5, -2);
		
		APLine line2 = new APLine(-25, 40, 30);
		double slope2 = line2.getSlope();
		boolean onLine2 = line2.isOnLine(5, -2);
		
		System.out.println(slope1);
		System.out.println(onLine1);
		System.out.println(slope2);
		System.out.println(onLine2);
	}
}

/*
Sample FR Questions:
1) d
2) b
3) b
4) e
5) e
6) e
7) d
8) c
9) c
10) b
11) a
 */