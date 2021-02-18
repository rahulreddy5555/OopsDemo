import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value");
		int n=obj.nextInt();
		//first pyramid
		for(int i=0;i<=n;i++) {
			
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
		
			System.out.println();
		}
		
		//next pyramid
        for(int i=n;i>=0;i--) {
			
			for(int j=n-i;j>=0;j--) {
				System.out.print(" ");
			}
			
			for(int k=i;k>=0;k--) {
				System.out.print("* ");
			}
		
			System.out.println();
		}

	}

}
