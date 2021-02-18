
public class ExeptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String langs[]= {"java","c++","c","js","c#"};
	try {	for(int c=1;c<=5;c++) {
			System.out.println(langs[c]);
		}}
	catch(Exception e) {
		System.out.println(e);
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	}

}
