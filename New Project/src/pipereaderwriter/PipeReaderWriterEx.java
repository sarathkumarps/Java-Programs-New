package pipereaderwriter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipeReaderWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		
			final PipedReader reader =new PipedReader();
			final PipedWriter writer=new PipedWriter(reader);
			
			Thread readerThread = new Thread(new Runnable() {
					public void run() {
						try {
						int data=reader.read();
						while(data !=-1) {
							System.out.println((char)data);
							data=reader.read();
						}
		} 
				catch(Exception e) 
		{
					e.printStackTrace();
		}
			
				}});


			}	
}