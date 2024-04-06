package Week2;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector(5,4) ; 
		Vector v2 = new Vector(3,4) ;
		Vector v = v1.add(v2) ;
		System.out.println(v);
		
		
		Vector v3 = new Vector(1,3);
		Vector v4 = new Vector(4,5);
		Rectangle rect = new Rectangle(v3, v4);
		rect.printRectangle();
		
		
	}

}
