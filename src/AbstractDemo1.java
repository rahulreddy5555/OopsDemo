abstract class Shape{
	String objname=" ";
	Shape(String name){
		objname=name;
	}
	public void MoveTo(int x,int y) {
		System.out.println(this.objname+" has been moved to "+"x="+x+", y="+y);
	}
	abstract double area();
	abstract void draw();
}

class Rectangle extends Shape{
	int length,width;
	Rectangle(int length,int width,String name) {
		super(name);
		this.length=length;
		this.width=width;
	}

	double area() {
		
		return (double)(length*width);
	}
	
	void draw() {
		System.out.println("rectangle has been drawn");
		
	}
	
}

class Circle extends Shape{
	double pi=3.14;
	int radius;

	Circle(int radius,String name) {
		super(name);
		this.radius=radius;
	    }
	public void draw() {
		System.out.println("circle is drawn");
	}
	double area() {
		return (double)((pi*radius*radius)/2);
	}
	
}


public class AbstractDemo1 {

	public static void main(String[] args) {
		Shape r=new Rectangle(3, 40, "Rectangle");
		r.draw();
		System.out.println("area of rectangle is"+r.area());
		r.MoveTo(3, 30);
		
		
		Shape c=new Circle(4, "circle");
		c.draw();
		System.out.println("area of circle is"+c.area());
		c.MoveTo(4, 6);
	}

}
