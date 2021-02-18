
public class StringBufferDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer tsr=new StringBuffer(" rahulreddy");
		int l=tsr.length();
		System.out.println("length: "+l);
		System.out.println("capacity: "+tsr.capacity());//16+13
		//System.out.println("Reverse: "+tsr.reverse());
	//	System.out.println(tsr.substring(0,4));
		System.out.println(tsr.delete(0, 4));
	}

}
