package javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colleciton1 
{
	public static void main(String[] args) 
	{
		
		List<Integer>list=new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		//list.add("akansha");
		list.add(2);
		list.add(1);
		list.add(8);
		list.add(5);
		list.add(9);
		list.add(12);
		list.add(43);
		list.add(34);
		list.add(11);	
		
		
//		Collections.sort(list);
//		System.out.println(list.contains(4));
//		
//		list.add(1, null);
		
		System.out.println(list);
	
		for(int dd:list)
		{
			System.out.println(dd);
		}
		
	}
}
