//TRuck class which has axels annd weight
class Truck{
	
	static int Axles;
	static int Totalweight;
	 
	//default constructer so that we can add parameters at truck objects
	Truck(int Axles,int Totalweight){
		this.Axles=Axles;
	    this.Totalweight=Totalweight;
	}
	static int truckAxles() {
		return Axles;
	}
	static int truckTotalweight() {
		return Totalweight;
	}
	public static int getAxles() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	}
	

class Tollgate{
	static int totaltrucks;
	static int totalreciepts;
	
	void trucktoll(Truck truck) {
		int Axles=Truck.truckAxles();
		int Totalweight=Truck.truckTotalweight();
		int tollpaid=(5*Axles)+(10*(Totalweight/500));
		System.out.println("Total toll paid in $:" +tollpaid);
		totaltrucks=totaltrucks+1;
		totalreciepts=totalreciepts+tollpaid;
		}

	void displayData(){
		System.out.println("totaltrucks passed till now:"+ totaltrucks);
		System.out.println("totalreciepts till now:"+ totalreciepts);
		
	    }
	
	//if tollgates members wants to reset data
	void reset() {
		totaltrucks=0;
		totalreciepts=0;
		
	}
	
	
}


//main class for tollgate where we create all objects

public class TollgateAssignment {

	public static void main(String[] args) {
	
		Tollgate t=new Tollgate();
		Truck truck1=new Truck(5, 4500);
		t.trucktoll(truck1);
		t.displayData();
		
		Truck truck2=new Truck(1, 1000);
		t.trucktoll(truck2);
		t.displayData();
		t.reset();
		
      Truck truck3=new Truck(10,8500);
        t.trucktoll(truck3);
        t.displayData();
	}

}
