import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputDemo {

	public static void main(String[] args) throws IOException {
	
		FileOutputStream fout=new FileOutputStream("t1.txt");
		
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="sachin ia a great player";
		
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("sucess");
	}

}
