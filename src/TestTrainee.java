import java.util.Scanner;

class Trainee{
	int tId;
	String tName;
	String technology;
	float salary, stipend;
	
	//define methods
	void input() {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter tid");
		tId=obj.nextInt();
		System.out.println("enter name");
		tName=obj.next();
		System.out.println("enter tech");
		technology=obj.next();
		System.out.println("enter salary");
		salary=obj.nextFloat();
		obj.close();
	}
	
	float calculate() {
		stipend=salary-200;
		return stipend;
	}
	
	void display() {
		System.out.println("----Trainee Details----");
		System.out.println("Trainee id: "+tId);
		System.out.println("Trainee name: "+tName);
		System.out.println("Trainee technology: "+technology);
		//System.out.println("Trainee salary: "+salary);
	}
}


public class TestTrainee {

	public static void main(String[] args) {
		
		Trainee t1=new Trainee();
		Trainee t2=new Trainee();
		
		t1.input();
		t2.input();
		float s1=t1.calculate();
	
		float s2=t2.calculate();
		t1.display();
		System.out.println("tr stifend:"+s1);
		t2.display();
		System.out.println("tr stifend:"+s2);
		
      
	}

}
