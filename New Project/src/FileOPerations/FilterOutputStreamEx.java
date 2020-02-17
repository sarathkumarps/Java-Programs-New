package FileOPerations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamEx {

	public static void main(String[] args) throws IOException {
		
//		File data=new File("D:\\testoutfilter.txt");
		FileOutputStream file=new FileOutputStream("D:\\testoutfilter.txt");
		FilterOutputStream filter=new FilterOutputStream(file);
		String s="Welcome";
		byte b[]=s.getBytes();
		filter.write(b);
		filter.flush();
		filter.close();
		System.out.println("Sucess");
		
		
		
	}
	
}
