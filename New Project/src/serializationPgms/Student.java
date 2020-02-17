package serializationPgms;

import java.io.Serializable;

public class Student implements Serializable{
	
	transient int id; //transient ,not seriasible,
	String name;
	int age;
	
	transient int cls;
	Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		
	}

}
