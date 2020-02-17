package FileOPerations;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEx {
	
	public static void main(String[] args) throws IOException {
		
		InputStream input=new FileInputStream("D:\\testoutdata.txt");
		DataInputStream inst=new DataInputStream(input);
		int a=inst.readInt();
		System.out.println(a);
//		String c=inst.readLine();
		
		inst.close();
		
		
	}

}
