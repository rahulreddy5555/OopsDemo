
public class ConstructorDemo {
     int id;
     public ConstructorDemo() {
		System.out.println("in constructor");
		id=10;
	}
     
    void display() {
    	System.out.println(id);
    }
	public static void main(String[] args) {
		
		ConstructorDemo c=new ConstructorDemo();
		ConstructorDemo c2=new ConstructorDemo();
		c.display();
	}

}
