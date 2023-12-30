package javaCollection;

import java.util.Vector;

public class Day4 
{
	public static void main(String[] args) 
	{
		
//		LinkedList l1=new LinkedList();
//		l1.add(0,"aaa");
//		l1.add(1,"bbb");
//		
//		
//		
//		LinkedList ll=new LinkedList(l1);
//		ll.add(4);
//		ll.add(6);
//		ll.add(8);
//		
//		ll.addFirst("Aakansha");
//		ll.addLast("Ajay");
//		System.out.println(ll);
//		
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		
//		ll.removeFirst();
//		ll.removeLast();
//		System.out.println(ll);
		
		
		Vector v=new Vector();
		v.add(100);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(9);
		v.add(4);
		v.add(1);
		v.add(1);
		v.addElement("India");
		
		v.removeElement(9);
		v.removeElementAt(0);
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v);
		
		v.setElementAt("Australia", 1);
		System.out.println(v);
		
	}
}
