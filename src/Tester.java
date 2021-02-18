
public class Tester {
	int eid;
	String name;
	double sal;
	
	public Tester(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	

	@Override
	public String toString() {
		return "Tester [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester t1=new Tester(101, "karthi", 6660);
		System.out.println(t1);
		System.out.println(t1.eid+" "+t1.name+" "+t1.sal);

	}

}
