package graphics;

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		int n=sc.nextInt();
		long[] array=new long[n];
		for(int i=0;i<n;i++)
		{
		array[i]=sc.nextLong();    
		}
		int m=sc.nextInt();
		Arrays.sort(array);
		long result=Long.MAX_VALUE;
		for(int i=0;i<=n-m;i++)
		{
		 result=Math.min(result,array[i+m-1]-array[i]);   
		}
		System.out.println(result);
		t--;
		}
	}
}














