package com.javaDay2;

import java.util.*;

public class MyArray {
	public static void main(String args[])
	{
		int a[]=new int[5];
		float[] b=new float[5];
		
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter values for an array");
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"] = "+a[i]);
			
			
		}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println("enter values for an array");
			b[i]=sc.nextFloat();
			
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println("b["+i+"] = "+b[i]);
			
			
		}
	}

}
