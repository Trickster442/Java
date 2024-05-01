package Week2;

public class Rectangle {
	Vector v1 ;
	Vector v2 ;
	Rectangle(Vector v1, Vector v2){
		this.v1 = v1 ;
		this.v2 = v2 ;
	}
	double getWidth() {
		return v2.getX() - v1.getX();
	}
	double getHeight() {
		return v2.getY() - v1.getY();
	}
	double area() {
		return this.getWidth() * this.getHeight();
	}
	Vector getCenter() {
		return v1.add(v2).scale(0.5);
	}
	void printRectangle() {
		System.out.print("vector v1 :");
		v1.print_vector();
		System.out.println();
		System.out.print("vector v2 :");
		v2.print_vector();
	}
	Boolean contains(Vector point) {
        return (point.getX() >= v1.getX() && point.getX() <= v2.getX() &&
                point.getY() >= v1.getY() && point.getY() <= v2.getY());
    }
	
	public String toString() {
		return "Rectangle [v1=" + v1 + ", v2=" + v2 + ", Width=" + getWidth() +", Height=" + getHeight() + ", Area=" + area()+", center="+ getCenter() +"]";
	}
	
	
}
