package javaCollection;

import java.util.Arrays;
import java.util.TreeSet;

public class PracticeConvertArray 
{
	public static void main(String[] args) 
	{
		//given array = {1,4,7,9,2,4,5,6,8}
		int[] arr1={1,4,7,9,2,4,5,6,8};

		TreeSet<Integer>ts=new TreeSet<Integer>();
		for(int ad:arr1)
		{
			ts.add(ad);
		}
		
		//System.out.println(ts);
		int[]arr2=new int[ts.size()];
		int i=0;
		for(int dd:ts)
		{
			arr2[i]=dd;
			i++;
		}
		System.out.println(Arrays.toString(arr2));
	}
}
