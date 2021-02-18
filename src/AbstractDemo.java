abstract class Animal1{
	abstract void sound();
	public void eat() {
		System.out.println("i can eat");
	}
}
class Dogg extends Animal1{
	void sound() {
		System.out.println("bow bow");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Animal1 a=new Dogg();
		a.sound();
		a.eat();

	}

}
