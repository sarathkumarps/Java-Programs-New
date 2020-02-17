package FileOPerations;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FilterInputsStreamEx {
	
	public static void main(String[] args) {
	try
		{
		File data=new File("D:\\testoutfilter.txt");
		FileInputStream file=new FileInputStream(data);
		FilterInputStream filter=new BufferedInputStream(file);
		int k=0;
		while((k=filter.read())!=-1)
		{
			System.out.println((char)k);
		}
		}
	catch(IOException e)
		{
			System.out.println(e);
		}

	}
}
