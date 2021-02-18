
public class Employeeassignment {
	String name;
	int yearofjoining;
	double salary;
	String address;
	
	public Employeeassignment(String name, int yearofjoining, String address) {
		this.name = name;
		this.yearofjoining = yearofjoining;
		this.address = address;
	}
	
	void displaydata() {
		
		System.out.println(name+"         "+yearofjoining+"         "+address);
	}
	
		public static void main(String[] args) {
		System.out.println("Name"+"      "+"Year of joining"+"    "+"Address");
		System.out.println();
		//System.out.println();
		Employeeassignment e1=new Employeeassignment("Rahul", 2021, "saroornagar");
		Employeeassignment e2=new Employeeassignment("navin", 2021, "ECIL");
		Employeeassignment e3=new Employeeassignment("Reddy", 2021, "Lbnagar");
		Employeeassignment e4=new Employeeassignment("Pavan", 2021, "kukatpally");
		e1.displaydata();
		e2.displaydata();
		e3.displaydata();
		e4.displaydata();

	}

}
