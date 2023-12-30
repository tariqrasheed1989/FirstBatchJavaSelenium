package javaCollection;

import java.util.ArrayList;
import java.util.Collections;

public class Day2ArrayList 
{
	public static void main(String[] args) 
	{
//		ArrayList li=new ArrayList();
		
//		li.add("abc");
//		li.add(1);
//		li.add("def");
//		li.add(6);
//		li.add(8);
//		li.add(2);
//		li.add(0);
//		
//		System.out.println(li);
//		//System.out.println(li.get(3));
//		//Collections.sort(li);
//		//System.out.println(li);
//		//System.out.println(li.get(6));
////		li.remove(1);
////		System.out.println(li);
////		li.remove("abc");
//		System.out.println(li);
//		System.out.println(li.size());
////		li.clear();
////		System.out.println(li);
//		System.out.println(li.isEmpty());
//		System.out.println(li.contains("def"));
//		System.out.println(li.indexOf("abc"));
		

		ArrayList<String>list=new ArrayList<String>();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add("grapes");
		
		Object[]a=list.toArray();
		for(Object fruit:a)
		{
			System.out.println(fruit);
		}
	}
}
