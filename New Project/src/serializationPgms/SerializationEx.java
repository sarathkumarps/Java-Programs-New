package serializationPgms;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationEx {
	public static void main(String[] args) {
		
		try
		{
			
			Student s1=new Student(5,"Sachin",45);
			//Creating Stream & Writing object
			FileOutputStream fout=new FileOutputStream("D:\\serialisation.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.println("Success");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
