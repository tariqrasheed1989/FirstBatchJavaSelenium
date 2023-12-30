package javaCollection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Day6 
{
	
	public static void main(String[] args) 
	{	ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(13);
		
		LinkedHashSet set=new LinkedHashSet();
		set.add(1);
		set.add(2);
		set.add(3);
	//	set.addAll(al);
		set.add(4);
		set.add(2);
		set.add("India");
		set.add(3.5);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		set.remove(2);
		System.out.println(set);
	}
}
