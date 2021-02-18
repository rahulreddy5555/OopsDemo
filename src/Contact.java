
public class Contact {
	void createcontact(String name,long num) {
		System.out.println(name+": "+num);
	}
	void createcontact(String name,long num1,long num2) {
		System.out.println(name+": "+num1+","+num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact c=new Contact();
		c.createcontact("Rahul", 9705361815l);
		c.createcontact("reddy", 9542568254l, 7095953686l);

	}

}
