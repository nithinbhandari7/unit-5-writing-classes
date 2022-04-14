public class OrderedPair implements Comparable<OrderedPair>{
	//instance data
	private double x;
	private double y;
	
	public OrderedPair(PolarCoordinate polar) {
		y = polar.getRadius() * Math.sin(polar.getAngle());
		x = polar.getRadius() * Math.cos(polar.getAngle());
	}
	
	public OrderedPair() {
		x = 0;
		y = 0;
	}
	
	public OrderedPair(double userX, double userY) {
		x = userX;
		y = userY;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double userX) {
		x = userX;
	}
	
	public void setY(double userY) {
		y = userY;
	}
	
	//precondition - o is an ordered pair
	public boolean equals(Object o) {
		OrderedPair other = (OrderedPair)o;
		return this.x == other.x && this.y == other.y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public double getDistance() {
		return Math.sqrt(x*x + y*y);
	}
	
	public double getDistance(OrderedPair other) {	
		return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
	}
	
	public double getSlope() {
		return y / x;
	}
	
	public double getSlope(OrderedPair other) {
		return (this.y - other.y) / (this.x - other.x);
	}
	
	public double angleTo() {
		double temp =  Math.atan2(y, x);
		if(temp >= 0) {
			return temp;
		} else {
			return 2 * Math.PI + temp;
		}
	}
	
	//returns -1 if ordered pair lies on axis
	public int getQuadrant() {
		if(x>0 && y>0) {
			return 1;
		} else if (x<0 && y>0) {
			return 2;
		} else if (x<0 && y<0) {
			return 3;
		} else if (x>0 && y<0) {
			return 4;
		} else {
			return -1;
		}
	}
	
	//precondition - angle is in radians
	//postcondition - x and y have been updated to reflect THIS coordinate
	public void setAngle(double angle) {
		PolarCoordinate  temp = new PolarCoordinate(angle, this.getDistance());
		OrderedPair tempOP = new OrderedPair(temp);
		this.x = tempOP.x;
		this.y = tempOP.y;
	}
	
	public OrderedPair getMidpoint() {
		return new OrderedPair(x/2, y/2);
	}
	
	public OrderedPair getMidpoint(OrderedPair other) {
		return new OrderedPair((this.x + other.x)/2, (this.y + other.y)/2);
	}
	
	public double findArea() {
		return (0.5 * x * y);
	}
	
	//postcondition - this.y has been negated
	public void reflectOverX(){
		this.y *= -1;
	}
	
	//postcondition - this.x has been negated
	public void reflectOverY() {
		this.x *= -1;
	}
	
	//postcondition - this.x and this.y have been scaled to multiple times
	public void scale(double multiple){
		this.x *= multiple;
		this.y *= multiple;
	}
	
	//postcondition - this.x and this.y have been changed so that the distance between this ordered pair and the origin is 1
	public void normalize(){
		PolarCoordinate  temp = new PolarCoordinate(this.angleTo(), 1);
		OrderedPair tempOP = new OrderedPair(temp);
		this.x = tempOP.x;
		this.y = tempOP.y;
	}
	
	public PolarCoordinate getPolarCoordinate(){
		return new PolarCoordinate(this.angleTo(), this.getDistance());
	}
	
	public int compareTo(OrderedPair other) {
		double thisDist = this.getDistance();
		double otherDist = other.getDistance();
		if(thisDist > otherDist) {
			return 1;
		} else if (otherDist > thisDist) {
			return -1;
		} else {
			return 0;
		}
	}
}