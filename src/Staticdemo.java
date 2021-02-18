public class Staticdemo {
	//static int count;
	int count;
	Staticdemo(){
		count=count+1;
	}
	void display() {
		System.out.println("no. of objects: "+count);
	}

	public static void main(String[] args) {
		Staticdemo s1=new Staticdemo();
		Staticdemo s2=new Staticdemo();
		Staticdemo s3=new Staticdemo();
		//Staticdemo.display();
		s2.display();
		

	}

}
