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
	 int d=sc.nextInt();
	 int[] arr=new int[n];
	 for(int i=0;i<n;i++)
	 {
	  arr[i]=sc.nextInt();   
	 }
	 	boolean flag = false;
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(arr[0]);
	for(int i=1;i<n;i++)
	{
	 if(set.contains(arr[i]+d) || set.contains(arr[i]-d))
	 {
	  flag=true;
	  break;
	 }
	 set.add(arr[i]);
	}
	if(flag==true)
	{
	    System.out.println(1);
	}
	else
	{
	    System.out.println(-1);
	}
	t--;
	}
	}
}















