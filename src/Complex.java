
public class Complex {
	double real;
	double imaginary;
	public Complex(double r,double i) {
		real=r;
		imaginary=i;
	}
	void add(Complex obj2) {
		this.real+=obj2.real;
		this.imaginary+=obj2.imaginary;
	}
	void display() {
		System.out.println(this.real+"+i"+this.imaginary);
	}
	public static void main(String[] args) {
		Complex obj1=new Complex(3.2, 4.5);
		Complex obj2=new Complex(10.4,4.5);
		
		obj1.display();
		obj2.display();
		obj1.add(obj2);
		obj1.display();
		obj2.add(obj1);
		obj2.display();
		

	}

}
