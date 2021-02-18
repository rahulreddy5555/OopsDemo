class Bank{
	int getRateofinterest() {
		return 0;
	}
}
class Icici extends Bank{
	int getRateofinterest() {
		return 8;
	}
}

class Sbi extends Bank{
	int getRateofinterest() {
		return 7;
	}
}

class Axis extends Bank{
	int getRateofinterest() {
		return 9;
	}
}

public class OverrideDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbi s=new Sbi();
		s.getRateofinterest();
		Bank bank=new Icici();
		System.out.println(bank.getRateofinterest());
		Bank bank2=new Axis();
		System.out.println(bank2.getRateofinterest());

	}

}
