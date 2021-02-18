import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try{Reader r=new FileReader("test6.txt");
		int data=r.read();
		while(data!=-1) {
			System.out.print((char)data);
			data=r.read();
			
		}
		r.close();}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
