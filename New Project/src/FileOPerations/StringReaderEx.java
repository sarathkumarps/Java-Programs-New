package FileOPerations;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderEx {
	public static void main(String[] args) {
		String srg="Hello World \nWelcome to java";
		StringReader reader=new StringReader(srg);
		int k=0;
		
		try
		{
			while((k=reader.read())!=-1)
			{
				System.out.print((char)k);
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
