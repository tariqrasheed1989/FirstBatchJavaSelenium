package javaCollection;

import java.util.Scanner;
import java.util.Stack;

public class Day5 
{
	public static void main(String[] args) 
	{
		Stack st=new Stack();
		
	// to import package -	shift + control + o
		st.push("Tariq");
		st.push("Ajay");
		st.push("Dev");
		

		System.out.println(st);
		
		System.out.println(st.peek());
		//st.pop();
		
		
		System.out.println(st.search("Dev"));
		st.clear();
		
		System.out.println(st.empty());
		
	}
}
