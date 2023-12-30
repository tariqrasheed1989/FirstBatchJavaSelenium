package EveningBatch630;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListPractice 
{
	public static void main(String[] args) 
	{
//		ArrayList<Integer>al=new ArrayList<Integer>();//Object
		LinkedList<Integer>al=new LinkedList<Integer>();
	//	al.add("India");
		al.add(5);
		al.add(76);
		al.add(54);
		al.add(50);
		al.add(36);
		al.add(74);
	//	System.out.println(al);
		//method 1
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//			
//		}
		//method -2
//		Iterator it=al.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		//method-3
		for(int x:al)
		{
			System.out.println(x);
		}
	}

}
