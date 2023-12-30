package javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sundayBatch 
{
	public static void main(String[] args) 
	{
		ArrayList li2=new ArrayList();
		li2.add(111);
		li2.add(222);
		li2.add(333);
		li2.add(33);
		li2.add(35);
		li2.add(30);
	//	li2.add("abc");
	//	li2.add(3.4);
		li2.add(12);
		
		Collections.sort(li2);

		//method1
//		for(int i=0;i<li2.size();i++)
//		{
//			System.out.println(li2.get(i));
//		}
		//method2
//		for(Object dd:li2)
//		{
//			System.out.println(dd);
//		}
		
		//method3
		
		Iterator it=li2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
	}
}
