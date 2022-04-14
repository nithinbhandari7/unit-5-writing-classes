import java.util.Arrays;

public class OrderedPairClient {
	public static void main(String[] args) {
		OrderedPair p1 = new OrderedPair(1,3);
		OrderedPair p2 = new OrderedPair(-2,8);
		OrderedPair p3 = new OrderedPair();
		OrderedPair p4 = new OrderedPair(-2.2,-1.4);
		OrderedPair p5 = new OrderedPair(5,-3);
		
		System.out.println(p1.angleTo());
		System.out.println(p2.getDistance(p3));
		System.out.println(p2.getDistance());
		System.out.println(p2.getMidpoint(p4));
		System.out.println(p5.getQuadrant());
		
		p5.reflectOverX();
		System.out.println(p5);
		p5.reflectOverY();
		System.out.println(p5);
		
		p1.setAngle(Math.PI/4);
		System.out.println(p1);
		p1.normalize();
		System.out.println(p1);
		
		OrderedPair[] points = {p1,p2,p3,p4,p5};
		System.out.println(Arrays.toString(points));
		Arrays.sort(points);
		System.out.println(Arrays.toString(points));
		
	}
}
