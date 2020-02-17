package FileOPerations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadEx {
	public static void main(String[] args) {
		
		try
		{
			FileReader fr=new FileReader("D:\\testoutbuff.txt");
			BufferedReader br=new BufferedReader(fr);
			
			String s;
			while((s=br.readLine())!=null)
			{
				System.out.print(s);
			}
			br.close();
			fr.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
