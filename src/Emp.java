
class Emp {
	int id;
	String name;
	Address address;
	Emp(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println(id+"  "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		
		Address ad1=new Address("lbnagar", "telangana", "India");
		Emp e=new Emp(1111, "rahul", ad1);

		Address ad2=new Address("saroornagar", "telangana", "India");
		Emp e2=new Emp(1112, "reddy", ad2);
		e.display();
		e2.display();
	}

}
