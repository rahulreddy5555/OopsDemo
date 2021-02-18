
public class Person5 {
	private job jb;
	public Person5() {
		this.jb=new job();
		jb.setSalary(1000);
		jb.setId(5360);
		jb.setRole("QA");
	}
	public void display() {
		System.out.println(jb.getId()+" "+jb.getRole()+" "+jb.getSalary());
	}
}
