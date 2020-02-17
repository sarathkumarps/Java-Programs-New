package FileOPerations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args) {
		try
		{
			FileWriter fw=new FileWriter("D:\\testfilewrite.txt");
			String s="Hello World";
			fw.write(s);
			fw.close();
			System.out.println("Success");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
