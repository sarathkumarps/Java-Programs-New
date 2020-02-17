package serializationPgms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Deserializationex {
	public static void main(String[] args) {
		//Creating Stream to read Object
		
		
		try {
			FileInputStream input = new FileInputStream("D:\\serialisation.txt");
			ObjectInputStream in=new ObjectInputStream(input);
			Student s=(Student)in.readObject();
			System.out.println(s.id+" "+s.name+" "+s.age+" ");
			//closing stream
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 
		}
		
		
	}

}
