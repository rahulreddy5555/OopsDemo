
final class FinalClass {
		  public void display() {
		    System.out.println("This is a final method.");
		  }
		}

		// try to extend the final class
class FinalClassDemo{
		  public  void display() {
		    System.out.println("The final method is overridden.");
		  }

		  public static void main(String[] args) {
			FinalClass f=new FinalClass();
			f.display();
		    FinalClassDemo obj = new FinalClassDemo();
		    obj.display();
		  }
	}


