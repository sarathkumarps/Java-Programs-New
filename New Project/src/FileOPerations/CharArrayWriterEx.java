package FileOPerations;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterEx {
	public static void main(String[] args) throws IOException {
		CharArrayWriter out=new CharArrayWriter();
		out.write("Welcome to Java");
		FileWriter f1=new FileWriter("D:\\a.txt");
		FileWriter f2=new FileWriter("D:\\b.txt");
		FileWriter f3=new FileWriter("D:\\c.txt");
		FileWriter f4=new FileWriter("D:\\d.txt");
		out.writeTo(f1);
		out.writeTo(f2);
		out.writeTo(f3);
		out.writeTo(f4);
		f1.close();
		f2.close();
		f3.close();
		f4.close();
		
		
		
	}

}
