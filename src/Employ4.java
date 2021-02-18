
public class Employ4 {
	double salary;
	int workperday;
	void getInfo(double salary,int workperday) {
		this.salary=salary;
		this.workperday=workperday;
	}
	void addsal() {
		if(salary<500) {
			salary+=10;
		}
	}
	void addwork() {
		if(workperday>6) {
			salary+=5;
		}
	}
	void displaynet() {
		System.out.println("net salary is: "+salary+"$");
	}
	public static void main(String[] args) {
		Employ4 e1=new Employ4();
		e1.getInfo(250, 7);
		e1.addsal();
		e1.addwork();
		e1.displaynet();
		
	}

}
