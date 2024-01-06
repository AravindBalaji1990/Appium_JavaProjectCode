package File_Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStream {
	public static void main(String args[]){
		   
		   try{
		      byte bWrite [] = {1,2,3};
		      OutputStream os = new FileOutputStream("D:\\SeleniumPrograms\\Java_File\\DataTextFile\\output3.txt");
		      for(int x=0; x < bWrite.length ; x++){
		         os.write( bWrite[x] ); // writes the bytes
		      }
		      os.close();
		     
		      InputStream is = new FileInputStream("D:\\SeleniumPrograms\\Java_File\\DataTextFile\\input2.txt");
		      int size = is.available();
		      //System.out.println(size);
		      for(int i=0; i< size; i++){
		         System.out.print((char)is.read() + "  ");
		      }
		      is.close();
		   }catch(IOException e){
		      System.out.print("Exception");
		   }	
		   }
}
