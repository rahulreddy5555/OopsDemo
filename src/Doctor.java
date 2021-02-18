
public class Doctor {
	protected String name;
	protected int idnum;
	protected String address;
	Doctor(){
		
	}
	Doctor(final String str,final int num, final String addr){
		name=str;
		idnum=num;
		address=addr;
		
	}
	
	public void display() {
		System.out.println("name is "+ name);
		System.out.println("idnumber is "+ idnum);
		System.out.println("address is "+ address);
	}
}

