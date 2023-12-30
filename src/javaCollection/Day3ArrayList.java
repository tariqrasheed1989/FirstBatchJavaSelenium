package javaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Day3ArrayList 
{	
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(111);
		al.add(222);
				
		
		ArrayList li=new ArrayList(al);
		li.add(1);
		li.add("Ajay");
		//li.addAll(al);
		li.add(8);
		li.add(5);
		li.add(9);
		
		
		
		System.out.println(li.contains("Ajay"));
		
		System.out.println(li.size());
		
		System.out.println(li);
		
//		for(Object dd:li)
//		{
//			System.out.println(dd);
//		}
		
//		for(int i=0;i<=li.size()-1;i++)
//		{
//			System.out.println(li.get(i));
//		}
		
		Iterator it=li.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		LinkedList all=new LinkedList();
		al.add(111);
		al.add(222);
			
	}
	
	
	
}
