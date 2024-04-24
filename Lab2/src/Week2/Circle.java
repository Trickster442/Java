package Week2;


public class Circle {
	Vector center ;
	double radius ;
	
	public Circle(Vector center, double radius) {
		this.center = center ;
		this.radius = radius ;
	}
	
	double getDiameter() {
		return 2 * this.radius ;
	}
	
	double getArea() {
		 return Math.PI * Math.pow(this.radius, 2);
	}
	
	Boolean contains(Vector point) {
		Vector offset = point.subtract(this.center);
		return offset.length() <= this.radius ;
	}
	
	Rectangle bounding_box() {
		double cx = this.center.x;
		double cy = this.center.y ;
		Vector p1 = new Vector(cx - this.radius, cy - this.radius);
		Vector p2 = new Vector(cx + this.radius, cy + this.radius);
		return new Rectangle(p1,p2);
	}
}
