package FinalKeyword;

//Cannot override a final method or variable
public class sampleFinal {
	 final void run(){System.out.println("running");}  
	}  
	     
	class Honda {  
	   void run(){System.out.println("running safely with 100kmph");}  
	     
	   public static void main(String args[]){  
	   Honda honda= new Honda();  
	   honda.run();  
	   }  
}
