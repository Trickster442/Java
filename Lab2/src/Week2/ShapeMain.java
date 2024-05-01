package Week2;

public class ShapeMain {

	public static void main(String[] args) {
//		Vector v1 = new Vector(5,4) ; 
//		Vector v2 = new Vector(3,4) ;
//		Vector v = v1.add(v2) ;
//		System.out.println(v);
//		
//		Vector v3 = new Vector(1,3);
//		Vector v4 = new Vector(4,5);
//		Rectangle rect = new Rectangle(v3, v4);
//		rect.printRectangle();
//		
//		Vector v5 = new Vector(1,3);
//		Vector v6 = new Vector(4,5);
//		Rectangle rect2 = new Rectangle(v5,v6);
//		rect.printRectangle();
//		Vector p = new Vector(2,4);
//		System.out.println(rect2.contains(p));
//		
//		System.out.println();
//		
//		Vector v1 = new Vector(1, 1);
//        Vector v2 = new Vector(5, 4);
//        Rectangle rectangle = new Rectangle(v1, v2);
//
//        // Print rectangle information
//        System.out.println("Rectangle:");
//        rectangle.printRectangle();
//        System.out.println("Width: " + rectangle.getWidth());
//        System.out.println("Height: " + rectangle.getHeight());
//        System.out.println("Area: " + rectangle.area());
//        System.out.println("Center: " + rectangle.getCenter());
//
//        // Test if point is contained in rectangle
//        Vector testPoint = new Vector(2, 2);
//        System.out.println("Contains point " + testPoint + "? " + rectangle.contains(testPoint));
//
//        System.out.println();
		
		System.out.println("---Vector----");
		double a = 5 ;
		double b = 7 ;
		Vector v1 = new Vector(a,b);
		Vector v2 = new Vector(3,4);
		v1.print_vector();
		System.out.println(v1);
		System.out.println(v1.add(v2));
		System.out.println(v1.subtract(v2));
		System.out.println(v1.length());
		System.out.println(v1.getX());
		System.out.println(v1.getY());
		System.out.println(v1.scale(2));
		
		System.out.println();
		System.out.println();
		System.out.println("---Circle---");
		Vector cen = new Vector(5,5);
		double rad = 7 ;
		Circle c1 = new Circle(cen, rad);
		System.out.println(c1);
		System.out.println(c1.getDiameter());
		System.out.println(c1.getArea());
		Vector check = new Vector(5,5);
		System.out.println(c1.contains(check));
		System.out.println(c1.bounding_box());
		
	}
}
