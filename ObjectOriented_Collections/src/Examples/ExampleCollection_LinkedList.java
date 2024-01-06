package Examples;

import java.util.LinkedList;
import java.util.List;

class ExampleCollection_LinkedList {
	int id;  
	String name,author,publisher;  
	int quantity;  
	public ExampleCollection_LinkedList(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}  
}
class LinkedListExample {  
public static void main(String[] args) {  
    //Creating list of Books  
    List<ExampleCollection_LinkedList> list=new LinkedList<ExampleCollection_LinkedList>();  
    //Creating Books  
    ExampleCollection_LinkedList b1=new ExampleCollection_LinkedList(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    ExampleCollection_LinkedList b2=new ExampleCollection_LinkedList(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    ExampleCollection_LinkedList b3=new ExampleCollection_LinkedList(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    //Traversing list  
    for(ExampleCollection_LinkedList b:list){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  
