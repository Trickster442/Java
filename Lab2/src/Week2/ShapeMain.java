package Week2;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vector v1 = new Vector(5,4) ; 
//		Vector v2 = new Vector(3,4) ;
//		Vector v = v1.add(v2) ;
//		System.out.println(v);
//		
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
		
		Vector v1 = new Vector(1, 1);
        Vector v2 = new Vector(5, 4);
        Rectangle rectangle = new Rectangle(v1, v2);

        // Print rectangle information
        System.out.println("Rectangle:");
        rectangle.printRectangle();
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.area());
        System.out.println("Center: " + rectangle.getCenter());

        // Test if point is contained in rectangle
        Vector testPoint = new Vector(2, 2);
        System.out.println("Contains point " + testPoint + "? " + rectangle.contains(testPoint));

        System.out.println();
	}

}
