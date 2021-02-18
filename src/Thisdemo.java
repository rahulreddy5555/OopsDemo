
public class Thisdemo {
	int instvar;
	Thisdemo(int instvar){
		this.instvar=instvar;
		System.out.println("this reference= "+ this);
	}
	public static void main(String[] args) {
		
		
     Thisdemo obj=new Thisdemo(8);
     System.out.println("obj reference= "+ obj);
	}

}
