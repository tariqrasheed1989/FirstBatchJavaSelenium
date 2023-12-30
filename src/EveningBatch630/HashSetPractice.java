package EveningBatch630;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetPractice 
{
	public static void main(String[] args) 
	{ //int = primitive data type, Integer wrapper class
//				
//		Integer[] number= {2,3,4,2,4,1};
//	List<Integer>newList=Arrays.asList(number);
//	HashSet newSet=new HashSet(newList);
//	System.out.println(newSet);
	
//		List<String> list=Arrays.asList(things);
//		HashSet st=new HashSet(list);
//		System.out.println(st);
		
//		ArrayList li=new ArrayList();
//		li.add("Clock");
//		li.add("Door");
//		li.add("clock");
//		li.add("Fan");
//		li.add("Table");
//		li.add("Door");
		
//		HashSet<Object> set=new HashSet<Object>();//object
//		set.add(6);
//		set.add(5);
//		set.add(null);
//		set.add(6);
//		set.add("Brinjal");
//		set.add("Potato");
//		set.add("Potato");
//		set.add(null);
//		System.out.println(set);
//		
//		set.remove(5);
//		System.out.println(set);
		
		LinkedHashSet<Object> lset=new LinkedHashSet<Object>();//object
		lset.add(6);
		lset.add(5);
		lset.add(null);
		lset.add(6);
		lset.add("Brinjal");
		lset.add("Potato");
		lset.add("Potato");
		lset.add(null);
		System.out.println(lset);
		
//		Iterator it=lset.iterator();
//		while(it.hasNext())
//		{
//			//execute
//			System.out.println(it.next());
//		}
		
		for(Object d:lset)
		{
			System.out.println(d);
		}
		
		
	}

}
