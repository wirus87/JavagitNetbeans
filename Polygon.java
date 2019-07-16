
public class Polygon {
	public static void main(String[] args) {
		Polygon poly= new Polygon();
		System.out.println(poly.shapeArea(1));
		System.out.println(poly.shapeArea(3));
		System.out.println(poly.shapeArea(4));
	}
	
	int shapeArea(int n) {
		if (n<=1) {
			return 1;
		}
		else {
			return shapeArea(n-1)+ (n-1)*4;
		}
	}
}
