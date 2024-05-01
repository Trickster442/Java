package Week2;

public class Vector {
		double x ; 
		double y ;
		
		Vector(double x , double y){
			this.x = x ; 
			this.y = y ;
		}
		
		Vector scale (double factor) {
			double new_x = this.x * factor ; 
			double new_y = this.y * factor ;
			return new Vector(new_x , new_y) ;
		}
		
		Vector subtract (Vector other){
			double new_x = this.x - other.x ;
			double new_y = this.y - other.y ;
			return new Vector(new_x , new_y );
		}
		@Override
		public String toString() {
			return "Vector [x=" + x + ", y=" + y + "]";
		}
		double length() {
			double rSquared = this.x * this.x + this.y * this.y ;
			return rSquared ; 
		}
		
		Vector add (Vector vector) {
			double new_x = this.x + vector.x ;
			double new_y = this.y + vector.y ;
			return new Vector(new_x , new_y) ;
		}
		
		void print_vector(){
			System.out.println("vector x :" + this.x);
			System.out.println("vector y :" + this.y);
			System.out.println("vector length :" + this.length());
		}
		
		double getX() {
			return this.x;
		}
		 double getY() {
			 return this.y;
		 }
		
		

}
