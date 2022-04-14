public class PolarCoordinate {
	private double angle;
	private double r;
	
	public PolarCoordinate() {
		angle = 0;
		r = 0;
	}
	
	//precondition - angle is expressed in radians
	public PolarCoordinate(double angle, double r) {
		this.angle = angle;
		this.r = r;
	}
	
	public PolarCoordinate(OrderedPair point) {
		this.r = point.getDistance();
		this.angle = point.angleTo();
	}
	
	public double getAngle() {
		return angle;
	}
	
	public double getRadius() {
		return r;
	}
	
	public void setAngle(double angle) {
		this.angle = angle;
	}
	
	public void setRadius(double r) {
		this.angle = r;
	}
}
