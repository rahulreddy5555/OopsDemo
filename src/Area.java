import java.util.Scanner;

public class Area {
	int length;
	int breadth;
	public Area(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	void returnArea() {
		System.out.println("Area of rectangle is: "+length*breadth);
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter length");
		int l=obj.nextInt();
		System.out.println("enter breadth");
		int b=obj.nextInt();
		Area a=new Area(l,b);
		a.returnArea();
		obj.close();
	}

}
