package FileOPerations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteEx {
	public static void main(String[] args) {
		
		try {
			FileWriter fw=new FileWriter("D:\\testoutbuff.txt");
			BufferedWriter buffer=new BufferedWriter(fw);
			buffer.write("Welcome to java(Buffer)");
			buffer.close();
			System.out.println("Succses");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
