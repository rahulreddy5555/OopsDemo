
public class Testdoctor {

	public static void main(String[] args) {
		
		Specialist obj=new Specialist("Rahul", 53600, "Hyderabad", "Dentist");
		obj.display();
		
		
		Nonspecialist nsobj=new Nonspecialist("Reddy",5656,"Secunderabad");
       nsobj.display();
	}

}
