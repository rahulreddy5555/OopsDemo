
public class Time {
	int hrs;
	int minutes;
	int seconds;
	public Time(int h,int m,int s) {
		hrs=h;
		minutes=m;
		seconds=s;
	}
	void add(Time t2) {
		this.seconds+=t2.seconds;
		//increment minutes if seconds reaches 60
		if(this.seconds>59) {
			this.minutes+=1;
			this.seconds=this.seconds-60;
		}
		this.minutes+=t2.minutes;
		//increment hrs if mins reaches 60
		if(this.minutes>59) {
			this.hrs+=1;
			this.minutes=this.minutes-60;
		}
		this.hrs+=t2.hrs;
	}
	void display() {
		System.out.println(this.hrs+":"+this.minutes+":"+this.seconds);
	}

	public static void main(String[] args) {
		
       Time t1=new Time(3,30,50);
       Time t2=new Time(2,50,30);
       t1.display();
       t2.display();
       t1.add(t2);
       t1.display();
       
	}

}
