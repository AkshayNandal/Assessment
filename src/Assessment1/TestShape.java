package Assessment1;

interface Shape{
	static double getArea(double area) {
		return area;
	}
}

class Rectangle implements Shape{
	private double l;
	private double w;
	void getDimensions(double l, double w){
		this.l=l;
		this.w=w;
	}
	double getArea(){
		return l*w;	
	}
 String toString(String s){
	 return s;
}
}

class Triangle implements Shape{
	private double b;
	private double h;
	void getDimensions(double b, double h){
		this.b=b;
		this.h=h;
	}
	double getArea(){
		return 0.5+b*h;	
	}
 String toString(String s){
	 return s;
}
}

public class TestShape {

	public static void main(String[] args) {
		double a1,a2;
		Rectangle r1=new Rectangle();
		Triangle t1=new Triangle();
		r1.getDimensions(30, 40);
		a1=r1.getArea();
		t1.getDimensions(10, 20);
		a2=t1.getArea();
		System.out.println("Area of rectangle:"+a1);
		System.out.println("Area of Triangle:"+a2);	
}
}
