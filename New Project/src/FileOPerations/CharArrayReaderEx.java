package FileOPerations;
import java.io.CharArrayReader;
public class CharArrayReaderEx {

	
	public static void main(String[] args)throws Exception {
		char ar[]= {'J','a','v','a'};
//		CharArrayReader r=new CharArrayReader(ar);
		CharArrayReader r=new CharArrayReader(ar);
		int k=0;
		//Reading until EOF
		while((k=r.read())!=-1)
{
	char ch=(char)k;
	System.out.print(ch);
}
		
	}
}
