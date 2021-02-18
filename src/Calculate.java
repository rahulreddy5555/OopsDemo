
public class Calculate {
	void sum(){
		System.out.println("method overloading");
	}
	void sum(int a,int b) {
		System.out.println("sum is: "+(a+b));
	}
	void sum(float a,float b) {
		System.out.println("sum is: "+(a+b));
	}
	void sum(String a,String b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Calculate c=new Calculate();
		c.sum();
		c.sum(3,4);
		c.sum(1.2f, 6.3f);
		c.sum("rahul","reddy");
		}

	

}