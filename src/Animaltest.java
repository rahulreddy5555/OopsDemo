class Animal{
	int legs;
	String name;
	/*public Animal() {
		System.out.println("parent cons");
	}*/
	void eat() {
		System.out.println("i can eat");
	}
}
class Dog extends Animal{
	public void display() {
		System.out.println("my name is: "+name);
	}
}

public class Animaltest {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.name="rocky";
		d.display();
		d.eat();
	}

}
