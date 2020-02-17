package FileOPerations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;

public class StringWriterEx  {
public static void main(String[] args) throws IOException {
	StringWriter writer= new StringWriter();
	FileReader in=new FileReader ("D:\\testfilewrite.txt");
	BufferedReader buffer=new BufferedReader(in);
	int x;
	while((x=buffer.read())!=-1)
	{
		writer.write((char)x);
	}
	System.out.println(writer);
	writer.close();
	buffer.close();
	
	
}	

}
