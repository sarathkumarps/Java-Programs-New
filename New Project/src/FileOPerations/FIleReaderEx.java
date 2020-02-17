package FileOPerations;

import java.io.FileReader;

public class FIleReaderEx {

	public static void main(String[] args) {
	try
	{
		FileReader fr=new FileReader("D:\\testfilewrite.txt");
		int k=0;
		while((k=fr.read())!=-1)
		{
			System.out.print((char)k);
		}
	}catch(Exception e)
	{
		e.printStackTrace();
	}

	}	

}
