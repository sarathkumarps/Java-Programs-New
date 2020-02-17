package FileOPerations;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		String s="HAi";
		FileOutputStream file=new FileOutputStream("D:\\testoutdata.txt");
		DataOutputStream data=new DataOutputStream(file);
		data.writeInt(56);;
		data.writeChars(s);
		data.flush();
		data.close();
		System.out.println("Sucess");
	}
	
}
