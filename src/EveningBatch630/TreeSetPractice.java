package EveningBatch630;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetPractice 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("India");
		al.add("Australia");
		al.add("Japan");
		al.add("Australia");
		
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(3);
		ts.add(11);
		ts.add(15);
		ts.add(6);
		ts.add(1);
//		ts.add(null);
//		ts.addAll(al);
//		ts.add("Fan");
//		ts.add("Chair");
//		ts.add("Table");
//		ts.add("Mobile");
//		System.out.println(ts.ceiling(9));
//		System.out.println(ts.lower(2));
//		System.out.println(ts);		
		
		Comparator<Integer>reverse=Collections.reverseOrder();
		TreeSet<Integer>reverseData=new TreeSet<Integer>(reverse);
		reverseData.addAll(ts);
		System.out.println(reverseData);
		System.out.println(reverseData.first());
	}

}