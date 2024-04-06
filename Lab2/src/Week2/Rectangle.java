package Week2;

public class Rectangle {
	Vector v1 ;
	Vector v2 ;
	
	Rectangle(Vector v1, Vector v2){
		this.v1 = v1 ;
		this.v2 = v2 ;
	}
	
	double width() {
		return v2.getX() - v1.getX();
	}
	
	double height() {
		return v2.getY() - v1.getY();
	}
	
	double area() {
		return this.width() * this.height();
	}
	
	Vector center() {
		return v1.add(v2).scale(0.5);
	}
	
	void printRectangle() {
		System.out.print("vector v1 :");
		v1.print_vector();
		System.out.println();
		System.out.print("vector v2 :");
		v2.print_vector();
	}
	
	
}