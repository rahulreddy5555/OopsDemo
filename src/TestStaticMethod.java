class Student200{
	private int rollno;
	private String name;
	static String clg="MREM";
	
	public static void changecollege() {
		clg="cmr";
	}
	public Student200(int r,String n) {
		rollno=r;
		name=n;
	}
	
	public void display() {
		System.out.println(name+" "+rollno+" "+clg);
	}
}


public class TestStaticMethod{
	

	public static void main(String[] args) {
		
		Student200.changecollege();
		Student200 s1=new Student200(411, "Rahul");
		Student200 s2=new Student200(412, "surya");
		Student200 s3=new Student200(413, "Ram");
		s1.display();
		//Student200.changecollege();
		s2.display();
		s3.display();
	}

}
