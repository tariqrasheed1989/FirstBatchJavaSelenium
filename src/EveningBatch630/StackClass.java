package EveningBatch630;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackClass 
{
	public static void main(String a[]) 
	{		
		 	Stack<String> stack=new Stack<String>();//Object
		 	stack.push("Mango");
		 	stack.push("Banana");
		 	stack.push("Apple");
		 	stack.push("Guava");
		 	System.out.println(stack);
//		 	stack.pop();
//		 	System.out.println(stack);
//		 	stack.pop();
//		 	System.out.println(stack);
//		 	System.out.println(stack.peek());
//		 	stack.pop();
//		 	stack.pop();
		 	
		 	System.out.println(stack.search("Banana"));
		 	
//		 	while(!stack.empty())
//		 	{
//		 		stack.pop();
//		 	}		 	
//		 	System.out.println(stack);
		 			 			 
	}
}
