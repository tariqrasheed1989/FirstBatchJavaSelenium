package EveningBatch630;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class Book
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int idd, String name, String author, String publisher, int quantity)
	{
		id=idd;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
	public void info()
	{
		System.out.println("ID is "+id);
		System.out.println("Book name is "+name);
		System.out.println("Author is "+author);
		System.out.println("publisher is "+publisher);
		System.out.println("Quantity is "+quantity);	
	}
	
}

public class LinkedListBookExample 
{
	public static void main(String[] args) 
	{
		Book ob=new Book(121, "Java Tutorial", "Amit Kumar", "Lotus", 5);
		Book ob1=new Book(122, "Python Tutorial", "Rahul Kumar", "ABC", 10);
		Book ob2=new Book(123, "C# Tutorial", "Moazzam Shaban", "MA Academy", 8);
//		ob.info();
//		System.out.println("---------------");
//		ob1.info();
		
		LinkedHashMap<Integer, Book>map=new LinkedHashMap<Integer, Book>();
		map.put(1, ob);
		map.put(2, ob1);
		map.put(3, ob2);
		
		for(Entry<Integer,Book> entry:map.entrySet())
		{
			int key=entry.getKey();
			Book b=entry.getValue();
			System.out.println(key+" Details: ");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
			b.info();
		}
		
		
		
	}

}
