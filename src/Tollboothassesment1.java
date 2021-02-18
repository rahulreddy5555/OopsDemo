import java.util.Scanner;

interface Vehicle{
	Scanner obj=new Scanner(System.in);
	static int getAxels() {
		System.out.println("enter the no of axels for the truck");
		int a=obj.nextInt();
		return a;
	}
	static int getTotalweight() {
		System.out.println("enter the Total truckweight");
		int wt=obj.nextInt();
		return wt;
	}


}
	//first truck implements interface vehicle

class FordTruck implements Vehicle{
	static int Axels;
	static int Totalweight;
	/*public FordTruck(int Axels,int Totalweight) {
		this.Axels=Axels;
		this.Totalweight=Totalweight;
	}*/
	public int getAxels() {
		return Axels;
	}
	public  int getTotalweight() {
		return Totalweight;
	}
	
}
//second truck implements interface
class NissanTruck implements Vehicle{
	static int Axels;
	static int Totalweight;
	/*public NissanTruck(int Axels,int Totalweight) {
		this.Axels=Axels;
		this.Totalweight=Totalweight;
	}*/
	
	
	public int getAxels() {
		return Axels;
	}
	public int getTotalweight() {
		return Totalweight;
	}
}

interface TollBooth{
	static int totaltrucks=0;
	int totalreciepts=0;
	void calculateToll(Vehicle t);
	void display();
	void reset();
}

class AllegencyTollbooth implements TollBooth{
	static int totaltrucks=0;
	int totalreciepts=0;
	
	public void calculateToll(Vehicle t) {
		
		int Axles=Vehicle.getAxels();
		//System.out.println(Axles);
		int Totalweight=Vehicle.getTotalweight();
		//System.out.println(Totalweight);
		int tollpaid=(5*Axles)+(10*(Totalweight/500));
	    
		System.out.println("Total toll paid by this truck in $:" +tollpaid);
		totaltrucks=totaltrucks+1;
		totalreciepts=totalreciepts+tollpaid;
		}
		
	
	public void display() {
		
		System.out.println("totaltrucks passed till now:"+ totaltrucks);
		System.out.println("totalreciepts till now:"+ totalreciepts);
		
	}

	public void reset() {
		totalreciepts=0;
		totaltrucks=0;
		}


	
}


public class Tollboothassesment1 {

	public static void main(String[] args) {
		TollBooth booth=new AllegencyTollbooth();
		Vehicle ford=new FordTruck();
		booth.calculateToll(ford);
		booth.display();
		//booth.reset();
		//booth.display();
		
	    //booth.reset();
		Vehicle Nissan=new NissanTruck();
		
		booth.calculateToll(Nissan);
		booth.display();
		
	}

}
